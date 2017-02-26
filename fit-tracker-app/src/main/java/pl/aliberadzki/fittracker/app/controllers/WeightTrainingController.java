package pl.aliberadzki.fittracker.app.controllers;

import org.springframework.web.bind.annotation.*;
import pl.aliberadzki.fittracker.app.domain.GymWorkout;
import pl.aliberadzki.fittracker.app.domain.Set;
import pl.aliberadzki.fittracker.app.domain.WeighliftingExercise;
import pl.aliberadzki.fittracker.app.domain.Workout;

import java.time.LocalDate;

/**
 * Created by aliberadzki on 25.02.17.
 */
@RestController
public class WeightTrainingController {

    @RequestMapping(value = "/api/training/{id}", method = RequestMethod.GET)
    public @ResponseBody Workout getTraining(
            @PathVariable String id)
    {
        Workout workout = new GymWorkout(LocalDate.now());
        workout.addExercise(new WeighliftingExercise(new Set[]{
                new Set(100, 10),
                new Set(110, 9),
                new Set(120, 8)
        }));
        return workout;
    }
}
