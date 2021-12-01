package svoby.spring.projectmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import svoby.spring.projectmanagement.domain.Projekt;
import svoby.spring.projectmanagement.domain.Zamestnanec;
import svoby.spring.projectmanagement.repositories.ProjektRepository;
import svoby.spring.projectmanagement.repositories.ZamestnanecRepository;

import java.util.Arrays;

@SpringBootApplication
public class ProjectManagementApplication {

    @Autowired
    ZamestnanecRepository zamestnanecRepository;

    @Autowired
    ProjektRepository projektRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProjectManagementApplication.class, args);
    }

    /*@Bean
    CommandLineRunner commandLineRunner(){
        return args -> {

            Zamestnanec z1 = new Zamestnanec("Béda", "Hudeček", "hudecek@seznam.cz");
            Zamestnanec z2 = new Zamestnanec("Jiří", "Kroupa st.", "vykuk@seznam.cz");
            Zamestnanec z3 = new Zamestnanec("Viktor", "Hujer", "hujer@seznam.cz");

            Zamestnanec z4 = new Zamestnanec("Leopold", "Brašnář", "brasnar@seznam.cz");
            Zamestnanec z5 = new Zamestnanec("František", "Koudelka", "stschvojkovicebrod@seznam.cz");
            Zamestnanec z6 = new Zamestnanec("Lumír", "Práskal", "telprestavky@ct.cz");

            Zamestnanec z7 = new Zamestnanec("Josef", "Šumfrle", "sumfrle@seznam.cz");
            Zamestnanec z8 = new Zamestnanec("Josef", "Prokouk", "prokouk@gmail.com");
            Zamestnanec z9 = new Zamestnanec("Franta", "Jouda", "jouda@yahoo.com");

            Projekt p1 = new Projekt("Šití bot do rakve", "Nezahájen", "Šití bot do rakve horkou jehlou");
            Projekt p2 = new Projekt("Televizní přestávky", "Ve vývoji", "Návrh televizních přestávek");
            Projekt p3 = new Projekt("Správa hřbitova", "Ve vývoji", "Správa hřbitova, zodpovídání dotazů pozůstalých");
            Projekt p4 = new Projekt("Shánění kamaráda", "Hotovo", "Nějaký Jouda tady někoho shánel");
            Projekt p5 = new Projekt("Podlézání vedoucím", "Ve vývoji", "Úkol: podlézat vedoucím za jakoukoli cenu");
            Projekt p6 = new Projekt("Studování večerní školy", "Hotovo", "Vystudovat večerní průmyslovou školu");
            Projekt p7 = new Projekt("Vykradení spořitelny", "Hotovo", "Vykrást spořitelnu");
            Projekt p8 = new Projekt("Kondiciogram", "Hotovo", "Pořídit si kondiciogram od Výpočetního střediska Jih");

            p1.pridatZamestnance(z4);
            p2.pridatZamestnance(z6);
            p3.pridatZamestnance(z8);
            p4.pridatZamestnance(z9);
            p5.pridatZamestnance(z3);
            p6.pridatZamestnance(z2);
            p6.pridatZamestnance(z3);
            p7.pridatZamestnance(z7);
            p8.pridatZamestnance(z1);
            p8.pridatZamestnance(z5);

            z1.setProjekty(Arrays.asList(p8));
            z2.setProjekty(Arrays.asList(p6));
            z3.setProjekty(Arrays.asList(p5, p6));
            z4.setProjekty(Arrays.asList(p1));
            z5.setProjekty(Arrays.asList(p8));
            z6.setProjekty(Arrays.asList(p2));
            z7.setProjekty(Arrays.asList(p7));
            z8.setProjekty(Arrays.asList(p3));
            z9.setProjekty(Arrays.asList(p4));

            zamestnanecRepository.save(z1);
            zamestnanecRepository.save(z2);
            zamestnanecRepository.save(z3);
            zamestnanecRepository.save(z4);
            zamestnanecRepository.save(z5);
            zamestnanecRepository.save(z6);
            zamestnanecRepository.save(z7);
            zamestnanecRepository.save(z8);
            zamestnanecRepository.save(z9);

            projektRepository.save(p1);
            projektRepository.save(p2);
            projektRepository.save(p3);
            projektRepository.save(p4);
            projektRepository.save(p5);
            projektRepository.save(p6);
            projektRepository.save(p7);
            projektRepository.save(p8);


        };
    }*/

}
