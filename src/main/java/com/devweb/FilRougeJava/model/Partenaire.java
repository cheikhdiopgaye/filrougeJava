package com.devweb.FilRougeJava.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "partenaire")
public class Partenaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @NotBlank
    @Size(min=3, max = 50)
    private String raisonSocial;

    @NotBlank
    @Size(min=5, max = 20)
    private String ninea;
    @NotBlank
    @Size(min=3, max = 50)
    private String adress;
    @NotBlank
    @Size(min=9, max = 15)
    private   String telephon;
    @NotBlank
    @Size(min=2, max = 10)
    private   String etat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public String getNinea() {
        return ninea;
    }

    public void setNinea(String ninea) {
        this.ninea = ninea;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelephon() {
        return telephon;
    }

    public void setTelephon(String telephon) {
        this.telephon = telephon;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
