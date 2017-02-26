package pl.aliberadzki.fittracker.app.domain;

import java.util.List;

/**
 * Created by aliberadzki on 25.02.17.
 */
public interface User {
    void addWorkout(Workout workout);

    List getWorkouts();
}
