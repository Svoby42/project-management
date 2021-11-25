package svoby.spring.projectmanagement.domain;

import javax.persistence.*;

@Entity
public class Zamestnanec {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zamestnanecId;

    private String jmeno;
    private String prijmeni;
    private String email;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinColumn(name = "projekt_id")
    private Projekt projekt;

    public Zamestnanec(){

    }

    public Zamestnanec(String jmeno, String prijmeni, String email) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.email = email;
    }

    public long getZamestnanecId() {
        return zamestnanecId;
    }

    public void setZamestnanecId(long zamestnanecId) {
        this.zamestnanecId = zamestnanecId;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Projekt getProjekt() {
        return projekt;
    }

    public void setProjekt(Projekt projekt) {
        this.projekt = projekt;
    }
}
