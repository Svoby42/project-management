package svoby.spring.projectmanagement.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import svoby.spring.projectmanagement.domain.Projekt;
import svoby.spring.projectmanagement.dto.ProjektStav;

import java.util.List;

public interface ProjektRepository extends CrudRepository<Projekt, Long> {

    @Override
    public List<Projekt> findAll();

    @Query(nativeQuery = true, value = "SELECT stav, Count(*) as pocet FROM PROJEKT " +
            "group by stav")
    public List<ProjektStav> getProjektStav();

}
