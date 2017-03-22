package pl.aliberadzki.fittracker.app.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by aliberadzki on 28.02.17.
 */
@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarRepository repository;

    @Autowired
    public CarController(CarRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Car> getCars() {
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCar(@RequestBody Car car) {
        repository.save(car);
    }
}
