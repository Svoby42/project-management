package svoby.spring.projectmanagement.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import svoby.spring.projectmanagement.domain.Zamestnanec;
import svoby.spring.projectmanagement.dto.ZamestnanecProjekt;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "apizamestnanci", path = "apizamestnanci")
public interface ZamestnanecRepository extends PagingAndSortingRepository<Zamestnanec, Long> {

    @Query(nativeQuery = true, value = "select z.jmeno, z.prijmeni, COUNT(pz.zamestnanec_id) as projektPocet " +
            "from zamestnanec z left join projekt_zamestnanec pz ON pz.zamestnanec_id = z.zamestnanec_id " +
            "group by z.jmeno, z.prijmeni order by 3 desc")
    public List<ZamestnanecProjekt> zamestnanecProjekty();

    public Zamestnanec findByEmail(String value);

    public Zamestnanec findByZamestnanecId(long id);

}
