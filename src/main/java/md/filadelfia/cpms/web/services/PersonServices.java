package md.filadelfia.cpms.web.services;

import md.filadelfia.cpms.web.api.PersonsDao;
import md.filadelfia.cpms.web.core.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/person")
public class PersonServices {
    private final PersonsDao userDao;

    @Autowired
    public PersonServices(PersonsDao daoPersons) {
        this.userDao = daoPersons;
    }


    @RequestMapping(value="/add", method = RequestMethod.POST)
    @ResponseBody
    public void add(@RequestBody Person personJSON) throws Exception {
        System.out.println("First Name:"+personJSON.getFirstName()+"\tLast Name:"+personJSON.getLastName());
        userDao.save(personJSON);
    }

    @RequestMapping(value="/list")
    @ResponseBody
    public List<Person> list() throws Exception {
        return userDao.findAll();
    }
}
