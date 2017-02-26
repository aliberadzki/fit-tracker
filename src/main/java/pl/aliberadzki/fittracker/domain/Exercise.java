package pl.aliberadzki.fittracker.domain;

/**
 * Created by aliberadzki on 25.02.17.
 */
public interface Exercise {

    Set[] getSets();

    int volume();

    double intensity();
}
