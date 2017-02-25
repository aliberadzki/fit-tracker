package pl.aliberadzki.fittracker.domain;

/**
 * Created by aliberadzki on 25.02.17.
 */
public class DeadLift implements Exercise{
    private final Set[] sets;

    public DeadLift(Set[] sets) {
        this.sets = sets;
    }

    @Override
    public int volume() {
        int volume = 0;
        for(Set set : sets) {
            volume += set.kilos * set.reps;
        }
        return volume;
    }

    @Override
    public double intensity() {
        double intensitySum = 0;
        for(Set set : sets) {
            intensitySum += set.kilos; //TODO: I need one-rep-max reference
        }
        return intensitySum/sets.length;
    }
}
