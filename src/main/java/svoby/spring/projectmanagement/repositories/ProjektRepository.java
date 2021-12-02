package svoby.spring.projectmanagement.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import svoby.spring.projectmanagement.domain.Projekt;
import svoby.spring.projectmanagement.dto.ProjektStav;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "apiprojekty", path = "apiprojekty")
public interface ProjektRepository extends PagingAndSortingRepository<Projekt, Long> {

    @Override
    public List<Projekt> findAll();

    @Query(nativeQuery = true, value = "SELECT stav, Count(*) as pocet FROM PROJEKT " +
            "group by stav")
    public List<ProjektStav> getProjektStav();

}
