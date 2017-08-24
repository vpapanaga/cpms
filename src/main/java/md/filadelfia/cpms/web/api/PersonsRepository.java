package md.filadelfia.cpms.web.api;

import md.filadelfia.cpms.web.core.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepository extends CrudRepository<Person, String> {
}