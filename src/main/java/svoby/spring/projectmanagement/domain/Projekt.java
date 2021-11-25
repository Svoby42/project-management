package svoby.spring.projectmanagement.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Projekt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long projektId;

    private String nazev;
    private String stav;
    private String popis;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "projekt_zamestnanec",
            joinColumns = @JoinColumn(name = "projekt_id"),
            inverseJoinColumns = @JoinColumn(name = "zamestnanec_id"))
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

    public List<Zamestnanec> getZamestnanci() {
        return zamestnanci;
    }

    public void setZamestnanci(List<Zamestnanec> zamestnanci) {
        this.zamestnanci = zamestnanci;
    }

    public void pridatZamestnance(Zamestnanec zamestnanec){
        if(zamestnanci == null){
            zamestnanci = new ArrayList<>();
        }
        zamestnanci.add(zamestnanec);

    }

}
