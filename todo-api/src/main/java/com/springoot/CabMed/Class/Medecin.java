package com.springoot.CabMed.Class;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Medecin {
    @Id
    private int id_medecin;

    private String prenom ;
    private String nom ;
    private String specialite ;


    public Medecin(int id_medecin, String prenom, String nom, String specialite) {
        this.id_medecin = id_medecin;
        this.prenom = prenom;
        this.nom = nom;
        this.specialite = specialite;
    }

    public int getId_medecin() {
        return id_medecin;
    }

    public void setId_medecin(int id_medecin) {
        this.id_medecin = id_medecin;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
