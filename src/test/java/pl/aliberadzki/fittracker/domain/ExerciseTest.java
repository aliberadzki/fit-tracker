package pl.aliberadzki.fittracker.domain;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

/**
 * Created by aliberadzki on 25.02.17.
 */
public class ExerciseTest {

    @Test
    public void testAddingWorkout() throws Exception {
        User user = new RegularUser();
        Workout newWorkout = new GymWorkout(LocalDate.now());
        user.addWorkout(newWorkout);
        assertEquals(1, user.getWorkouts().size());
    }

    @Test
    public void testWorkoutHasExercises() throws Exception {
        Workout workout = new GymWorkout(LocalDate.now());
        workout.addExercise(new DeadLift(new Set[]{}));
        workout.addExercise(new Squats());
        workout.addExercise(new BenchPress());

        assertEquals(3, workout.getExercises().size());
    }

    @Test
    public void testTotalWorkoutVolume() throws Exception {
        Workout workout = new GymWorkout(LocalDate.now());
        Set firstWarmupSet = new Set(75, 5);
        Set secondWarmupSet = new Set(115, 3);
        Set thirdWarmupSet = new Set(135, 1);
        Set firstSet = new Set(150, 5);
        Set secondSet = new Set(150, 5);
        workout.addExercise(new DeadLift(new Set[]{firstWarmupSet, secondWarmupSet, thirdWarmupSet, firstSet, secondSet}));

        assertEquals(75*5+115*3+135+150*10, workout.volume());

    }

    @Test
    public void testWorkoutIntensity() throws Exception {

        Workout workout = new GymWorkout(LocalDate.now());
        Set firstWarmupSet = new Set(75, 5);
        Set secondWarmupSet = new Set(115, 3);
        Set thirdWarmupSet = new Set(135, 1);
        Set firstSet = new Set(150, 5);
        Set secondSet = new Set(150, 5);
        workout.addExercise(new DeadLift(new Set[]{firstWarmupSet, secondWarmupSet, thirdWarmupSet, firstSet, secondSet}));

        Workout secondWorkout = new GymWorkout(LocalDate.now());
        firstWarmupSet = new Set(60, 10);
        secondWarmupSet = new Set(90, 6);
        thirdWarmupSet = new Set(110, 2);
        firstSet = new Set(120, 10);
        secondSet = new Set(120, 10);
        Set thirdSet = new Set(120, 10);
        secondWorkout.addExercise(new DeadLift(new Set[]{firstWarmupSet, secondWarmupSet, thirdWarmupSet, firstSet, secondSet, thirdSet}));

        assertTrue(workout.intensity() > secondWorkout.intensity());
    }
}