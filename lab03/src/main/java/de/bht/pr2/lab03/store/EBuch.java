package de.bht.pr2.lab03.store;

public class EBuch extends Buch{

    String titel;
    String buchArt;
    double preis;
    int jahr;
    int auflage;
    int tolinoVersion;


    public EBuch(String titel, String buchArt, double preis, int jahr, int auflage, int tolinoVersion){
        super(titel, buchArt, preis, jahr, auflage);
        this.tolinoVersion = tolinoVersion;
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


    public int getTolinoVersion() {
        return tolinoVersion;
    }


    public void setTolinoVersion(int tolinoVersion) {
        this.tolinoVersion = tolinoVersion;
    }
}