package md.filadelfia.cpms.web.api;

import md.filadelfia.cpms.web.core.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ErrorController {

    @GetMapping("/error")
    public ModelAndView index() {
        Map<String, String> model = new HashMap<>();
        return new ModelAndView("error");
    }

}
