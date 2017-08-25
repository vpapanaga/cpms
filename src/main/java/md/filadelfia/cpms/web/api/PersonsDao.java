package md.filadelfia.cpms.web.api;

import md.filadelfia.cpms.web.core.Person;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PersonsDao extends JpaRepository<Person, String> {
}