package pl.aliberadzki.fittracker.app.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by aliberadzki on 25.02.17.
 */
public class GymWorkout implements Workout {

    private List<Exercise> exercises = new ArrayList();

    public GymWorkout(LocalDate date) {
    }

    @Override
    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

    @Override
    public List getExercises() {
        return exercises;
    }

    @Override
    public int volume() {
        int volume = 0;
        for(Exercise exercise : exercises) {
            volume += exercise.volume();
        }
        return volume;
    }

    @Override
    public double intensity() {
        double intensitySum = 0;
        for(Exercise exercise : exercises) {
            intensitySum += exercise.intensity();
        }
        return intensitySum/exercises.size();
    }
}
