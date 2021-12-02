package svoby.spring.projectmanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import svoby.spring.projectmanagement.validators.UniqueValue;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Zamestnanec {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "zamestnanec_seq")
    private long zamestnanecId;

    @NotBlank(message = "Zadejte jméno")
    @Size(min=2, max=50, message = "Příliš krátké/dlouhé")
    private String jmeno;

    @NotBlank(message = "Zadejte přijmení")
    @Size(min=1, max=50, message = "Příliš krátké/dlouhé")
    private String prijmeni;

    @NotBlank
    @Email(message = "Špatný formát")
    @UniqueValue
    private String email;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "projekt_zamestnanec",
            joinColumns = @JoinColumn(name = "zamestnanec_id"),
            inverseJoinColumns = @JoinColumn(name = "projekt_id"))
    @JsonIgnore
    private List<Projekt> projekty;

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

    public List<Projekt> getProjekty() {
        return projekty;
    }

    public void setProjekty(List<Projekt> projekty) {
        this.projekty = projekty;
    }
}
