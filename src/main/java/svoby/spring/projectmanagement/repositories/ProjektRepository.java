package svoby.spring.projectmanagement.repositories;

import org.springframework.data.repository.CrudRepository;
import svoby.spring.projectmanagement.domain.Projekt;

public interface ProjektRepository extends CrudRepository<Projekt, Long> {

}
