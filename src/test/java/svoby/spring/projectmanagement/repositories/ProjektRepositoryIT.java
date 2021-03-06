package svoby.spring.projectmanagement.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;
import svoby.spring.projectmanagement.ProjectManagementApplication;
import svoby.spring.projectmanagement.domain.Projekt;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
@SqlGroup({
        @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = {"classpath:schema.sql", "classpath:data.sql"}),
        @Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, scripts = "classpath:drop.sql")})
public class ProjektRepositoryIT {

    @Autowired
    ProjektRepository projektRepository;

    @Test
    public void ifNewProjektSaved_thenSuccess(){
        Projekt projekt = new Projekt("Testovací projekt", "Hotovo", "Test popis");
        projektRepository.save(projekt);

        assertEquals(9, projektRepository.findAll().size());
    }

}
