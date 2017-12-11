package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @GetMapping(value = "login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @GetMapping(value = "profile")
    public ModelAndView profile() {
        return new ModelAndView("profile");
    }
}
