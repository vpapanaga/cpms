package md.filadelfia.cpms.web.services;

import md.filadelfia.cpms.web.core.Person;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/person")
public class PersonServices {

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public Person process(@RequestBody String payload) throws Exception {
        System.out.println(payload);

        Person person = new Person();
        person.setFirstName("First Name");
        person.setLastName("Last Name");
        return person;
    }


}
