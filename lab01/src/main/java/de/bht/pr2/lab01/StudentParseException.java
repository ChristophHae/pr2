package de.bht.pr2.lab01;

public class StudentParseException extends Exception {

    // Konstruktor nimmt einen String entgegen
    public StudentParseException(String meldung){
        super(meldung);  //macht eine neue exception und speichert die meldung für später
    }
}
