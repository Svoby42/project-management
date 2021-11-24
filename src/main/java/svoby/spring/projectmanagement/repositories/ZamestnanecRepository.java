package svoby.spring.projectmanagement.repositories;

import org.springframework.data.repository.CrudRepository;
import svoby.spring.projectmanagement.domain.Zamestnanec;

import java.util.List;

public interface ZamestnanecRepository extends CrudRepository<Zamestnanec, Long> {

    @Override
    public List<Zamestnanec> findAll();

}
