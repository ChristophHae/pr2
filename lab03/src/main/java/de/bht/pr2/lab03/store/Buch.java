package de.bht.pr2.lab03.store;

public class Buch {

    String titel;
    String buchArt;
    double preis;
    int jahr;
    int auflage;

    public Buch(String titel, String buchArt, double preis, int jahr, int auflage){
        this.titel = titel;
        this.buchArt = buchArt;
        this.preis = preis;
        this.jahr = jahr;
        this.auflage = auflage;

    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBuchArt() {
        return buchArt;
    }

    public void setBuchArt(String buchArt) {
        this.buchArt = buchArt;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public int getAuflage() {
        return auflage;
    }

    public void setAuflage(int auflage) {
        this.auflage = auflage;
    }
}
