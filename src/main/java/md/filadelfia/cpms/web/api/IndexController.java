package md.filadelfia.cpms.web.api;

import md.filadelfia.cpms.web.core.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

   /* final PersonsRepository personsRepository;

    public IndexController(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }*/

    @GetMapping("/")
    public ModelAndView index() {
        Map<String, String> model = new HashMap<>();
        model.put("name", "Victor Papanaga");

        Person person = new Person();
        person.setFirstName("Test");
        person.setLastName("User");

     //   personsRepository.save(person);

        return new ModelAndView("index", model);
    }


 }
