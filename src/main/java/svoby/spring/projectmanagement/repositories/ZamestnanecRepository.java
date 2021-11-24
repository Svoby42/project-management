package svoby.spring.projectmanagement.repositories;

import org.springframework.data.repository.CrudRepository;
import svoby.spring.projectmanagement.domain.Zamestnanec;

public interface ZamestnanecRepository extends CrudRepository<Zamestnanec, Long> {
}
