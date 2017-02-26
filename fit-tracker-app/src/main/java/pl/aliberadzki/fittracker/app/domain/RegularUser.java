package pl.aliberadzki.fittracker.app.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aliberadzki on 25.02.17.
 */
public class RegularUser implements User {
    private List<Workout> workouts = new ArrayList<>();

    @Override
    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    @Override
    public List getWorkouts() {
        return workouts;
    }
}
