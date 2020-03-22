package com.springoot.CabMed.Class;

public class Analyse {

    private float  glycemie ;
    private float  hypertension_arterielle;
    private float  cholesterol ;
    private float triglyceride ;
    private float transaminases;


    public Analyse(float glycemie, float hypertension_arterielle, float cholesterol, float triglyceride, float transaminases) {
        this.glycemie = glycemie;
        this.hypertension_arterielle = hypertension_arterielle;
        this.cholesterol = cholesterol;
        this.triglyceride = triglyceride;
        this.transaminases = transaminases;
    }

    public float getTriglyceride() {
        return triglyceride;
    }

    public void setTriglyceride(float triglyceride) {
        this.triglyceride = triglyceride;
    }

    public float getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(float cholesterol) {
        this.cholesterol = cholesterol;
    }

    public float getHypertension_arterielle() {
        return hypertension_arterielle;
    }

    public void setHypertension_arterielle(float hypertension_arterielle) {
        this.hypertension_arterielle = hypertension_arterielle;
    }

    public float getGlycemie() {
        return glycemie;
    }

    public void setGlycemie(float glycemie) {
        this.glycemie = glycemie;
    }

    public float getTransaminases() {
        return transaminases;
    }

    public void setTransaminases(float transaminases) {
        this.transaminases = transaminases;
    }
}
