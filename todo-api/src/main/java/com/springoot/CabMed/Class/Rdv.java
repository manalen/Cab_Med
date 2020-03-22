package com.springoot.CabMed.Class;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Rdv {
    @Id
    private int id_rdv ;

    private int id_patient ;
    private int id_medecin ;
    private long date ;
    private String  etat ;


    public Rdv(int id_rdv, int id_patient, int id_medecin, long date, String etat) {
        this.id_rdv = id_rdv;
        this.id_patient = id_patient;
        this.id_medecin = id_medecin;
        this.date = date;
        this.etat = etat;
    }

    public int getId_rdv() {
        return id_rdv;
    }

    public void setId_rdv(int id_rdv) {
        this.id_rdv = id_rdv;
    }

    public int getId_patient() {
        return id_patient;
    }

    public void setId_patient(int id_patient) {
        this.id_patient = id_patient;
    }

    public int getId_medecin() {
        return id_medecin;
    }

    public void setId_medecin(int id_medecin) {
        this.id_medecin = id_medecin;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
