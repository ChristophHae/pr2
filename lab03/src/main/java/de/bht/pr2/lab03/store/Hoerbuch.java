package de.bht.pr2.lab03.store;

public class Hoerbuch extends Buch {

    String titel;
    String buchArt;
    double preis;
    int jahr;
    int auflage;
    int abspielModus;
    public Hoerbuch(String titel, String buchArt, double preis, int jahr, int auflage, int abspielModus) {
        super(titel, buchArt, preis, jahr, auflage);
        this.abspielModus = abspielModus;
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
    public int getAbspielModus() {
        return abspielModus;
    }
    public void setAbspielModus(int abspielModus) {
        this.abspielModus = abspielModus;
    }
}
