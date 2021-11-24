package svoby.spring.projectmanagement.repositories;

import org.springframework.data.repository.CrudRepository;
import svoby.spring.projectmanagement.domain.Projekt;

import java.util.List;

public interface ProjektRepository extends CrudRepository<Projekt, Long> {

    @Override
    public List<Projekt> findAll();

}
