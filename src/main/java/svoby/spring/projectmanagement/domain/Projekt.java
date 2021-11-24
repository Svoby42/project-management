package svoby.spring.projectmanagement.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Projekt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projektId;

    private String nazev;
    private String stav;
    private String popis;

    @OneToMany(mappedBy = "projekt")
    private List<Zamestnanec> zamestnanci;

    public Projekt(){

    }

    public Projekt(String nazev, String stav, String popis) {
        this.nazev = nazev;
        this.stav = stav;
        this.popis = popis;
    }


    public long getProjektId() {
        return projektId;
    }

    public void setProjektId(long projektId) {
        this.projektId = projektId;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getStav() {
        return stav;
    }

    public void setStav(String faze) {
        this.stav = faze;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }
}
