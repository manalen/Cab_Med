package com.springoot.CabMed.Class;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class Patient {
    @Id
    private int _id;

    private String cin;
    private String prenom;
    final long datecreation;
    private String nom;
    private String adresse;
    private Analyse analyse ;
    
    private List<Rdv> listerdv = new ArrayList<>();
    private List<Consultation> listeconsultation = new ArrayList<Consultation>();
    private List<Prescription> liste_prescription = new ArrayList<>();



    public String getCin() {
        return cin;
    }

    public Patient() {
        this.datecreation = System.currentTimeMillis();

    }

    public Patient(int _id, String cin, String prenom, String nom, String adresse, Analyse analyse, List<Rdv> list, List<Consultation> listeconsultation, List<Prescription> liste) {
        this._id = _id;
        this.cin = cin;
        this.prenom = prenom;
        this.analyse = analyse;
        this.datecreation = System.currentTimeMillis();
        this.nom = nom;
        this.adresse = adresse;
        this.listerdv = list ;
        this.listeconsultation = listeconsultation;
        this.liste_prescription=liste;


    }

    public void setCin(String cin) {
        this.cin = cin;
    }


    public void set_id(int _id) {
        this._id = _id;
    }

    public int get_id() {
        return _id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public List<Consultation> getListeconsultation() {
        return listeconsultation;
    }

    public void setListeconsultation(List<Consultation> listeconsultation) {
        this.listeconsultation = listeconsultation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void ajouterconsultation(Consultation o) {
        listeconsultation.add(o);
    }



    public List<Rdv> getListerdv() {
        return listerdv;
    }

    public void setListerdv(List<Rdv> listerdv) {
        this.listerdv = listerdv;
    }

    public Analyse getAnalyse() {
        return analyse;
    }

    public void setAnalyse(Analyse analyse) {
        this.analyse = analyse;
    }

    public List<Prescription> getListe_prescription() {
        return liste_prescription;
    }

    public void setListe_prescription(List<Prescription> liste_prescription) {
        this.liste_prescription = liste_prescription;
    }
}







