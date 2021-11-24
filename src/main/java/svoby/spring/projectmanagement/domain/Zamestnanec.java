package svoby.spring.projectmanagement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Zamestnanec {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zamestnanecId;

    private String jmeno;
    private String prijmeni;
    private String email;


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
}
