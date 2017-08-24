package md.filadelfia.cpms.web.services;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/person")
public class PersonServices {

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public String process(@RequestBody String payload) throws Exception {
        System.out.println(payload);

        return "Person was Added!\nJSON:" + payload;
    }


}
