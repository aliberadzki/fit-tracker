package pl.aliberadzki.fittracker.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by aliberadzki on 25.02.17.
 */
@Controller
public class GreetingController {

    @RequestMapping("/rude")
    public String rudeness(
            @RequestParam(value = "name", required = false, defaultValue = "John") String name,
            Model model)
    {
        model.addAttribute("name", name);
        return "rudeGreeting";
    }

    @RequestMapping("/nice")
    public String niceness(
            @RequestParam(value = "name", required = false, defaultValue = "John") String name,
            Model model)
    {
        model.addAttribute("name", name);
        return "niceGreeting";
    }
}
