package pl.aliberadzki.fittracker.domain;

import java.time.Month;
import java.util.List;

/**
 * Created by aliberadzki on 25.02.17.
 */
public interface User {
    void addWorkout(Workout workout);

    List getWorkouts();
}
