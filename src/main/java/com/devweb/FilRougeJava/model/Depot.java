package com.devweb.FilRougeJava.model;

import javax.persistence.*;

@Entity
@Table(name = "depot")
public class Depot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  int montant;
    private  String dateDepot;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public String getDateDepot() {
        return dateDepot;
    }

    public void setDateDepot(String dateDepot) {
        this.dateDepot = dateDepot;
    }
}
