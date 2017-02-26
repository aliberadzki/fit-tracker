package pl.aliberadzki.fittracker.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aliberadzki on 25.02.17.
 */
@RestController
public class HelloContoller {

    @RequestMapping("/api/")
    public String index() {
        return "Hello, from fit-tracker application!";
    }
}
