package pl.aliberadzki.fittracker.domain;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by aliberadzki on 25.02.17.
 */
public interface Workout {
    void addExercise(Exercise exercise);

    List getExercises();

    int volume();

    double intensity();
}
