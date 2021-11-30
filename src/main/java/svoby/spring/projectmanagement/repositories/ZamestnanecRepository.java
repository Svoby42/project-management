package svoby.spring.projectmanagement.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import svoby.spring.projectmanagement.domain.Zamestnanec;
import svoby.spring.projectmanagement.dto.ZamestnanecProjekt;

import java.util.List;

public interface ZamestnanecRepository extends CrudRepository<Zamestnanec, Long> {

    @Override
    public List<Zamestnanec> findAll();

    @Query(nativeQuery = true, value = "select z.jmeno, z.prijmeni, COUNT(pz.zamestnanec_id) as projektPocet " +
            "from zamestnanec z left join projekt_zamestnanec pz ON pz.zamestnanec_id = z.zamestnanec_id " +
            "group by z.jmeno, z.prijmeni order by 3 desc")
    public List<ZamestnanecProjekt> zamestnanecProjekty();

}
