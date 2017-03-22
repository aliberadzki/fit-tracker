package pl.aliberadzki.fittracker.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by aliberadzki on 28.02.17.
 */
@Entity
public class Car {

    @Id
    @GeneratedValue
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
