package com.springoot.CabMed.Class;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
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
    
    private List<Date> listrdv;
    private List<Consultation> listeconsultation = new ArrayList<Consultation>();
    private List<String> traitement = new ArrayList<>();


    public String getCin() {
        return cin;
    }

    public Patient() {
        this.datecreation = System.currentTimeMillis();

    }

    public Patient(int _id, String cin, String prenom, String nom, String adresse, List<Date> listred, List<Consultation> listeconsultation, List<String> trai) {
        this._id = _id;
        this.cin = cin;
        this.prenom = prenom;
        this.datecreation = System.currentTimeMillis();
        this.nom = nom;
        this.adresse = adresse;
        this.listrdv = listred;
        this.listeconsultation = listeconsultation;

        this.traitement = trai;
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

    public List<String> getTraitement() {
        return traitement;
    }

    public void setTraitement(List<String> traitement) {
        this.traitement = traitement;
    }

    public List<Date> getListrdv() {
        return listrdv;
    }

    public void setListrdv(List<Date> listrdv) {
        this.listrdv = listrdv;
    }
}







