package com.springoot.CabMed.Class;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Consultation {
    @Id
    private int id_consultation ;

    private int id_patient ;
    private int id_medecinn;
    private long date;
    private String observation ;
    private Analyse analyse ;

    public int getId_consultation() {
        return id_consultation;
    }

    public void setId_consultation(int id_consultation) {
        this.id_consultation = id_consultation;
    }

    public int getId_patient() {
        return id_patient;
    }

    public void setId_patient(int id_patient) {
        this.id_patient = id_patient;
    }

    public int getId_medecinn() {
        return id_medecinn;
    }

    public void setId_medecinn(int id_medecinn) {
        this.id_medecinn = id_medecinn;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }







    public Consultation(int id_consultation, int id_patient, int id_medecinn, long date, String observation, Analyse a) {
        this.id_consultation = id_consultation;
        this.id_patient = id_patient;
        this.id_medecinn = id_medecinn;
        this.date = System.currentTimeMillis();
        this.observation = observation;
        this.analyse= a ;

    }


    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Analyse getAnalyse() {
        return analyse;
    }

    public void setAnalyse(Analyse analyse) {
        this.analyse = analyse;
    }
}
