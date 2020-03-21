package com.springoot.CabMed.Class;

public class Prescription {
    private int id_pres;
    private int id_consultation ;
    private String mécicament ;
    private long datedebut ;
    private long datefin ;

    public Prescription(int id_pres, int id_consultation, long datedebut, long datefin) {
        this.id_pres = id_pres;
        this.id_consultation = id_consultation;
        this.datedebut = datedebut;
        this.datefin = datefin;
    }

    public int getId_consultation() {
        return id_consultation;
    }

    public void setId_consultation(int id_consultation) {
        this.id_consultation = id_consultation;
    }

    public int getId_pres() {
        return id_pres;
    }

    public void setId_pres(int id_pres) {
        this.id_pres = id_pres;
    }

    public String getMécicament() {
        return mécicament;
    }

    public void setMécicament(String mécicament) {
        this.mécicament = mécicament;
    }

    public long getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(long datedebut) {
        this.datedebut = datedebut;
    }

    public long getDatefin() {
        return datefin;
    }

    public void setDatefin(long datefin) {
        this.datefin = datefin;
    }
}
