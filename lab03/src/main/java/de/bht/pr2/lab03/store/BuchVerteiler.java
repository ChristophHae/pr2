package de.bht.pr2.lab03.store;

import java.util.ArrayList;
import java.util.List;

public class BuchVerteiler {
    
        // Erstellt eine String Liste mit den Buchdaten
    List<String> soldBookData = BookStore.getSoldBooks();

    List<Buch> soldBooks = new ArrayList<Buch>();

    //Jede Zeile parsen
    for(String datenZeile : soldBookData){

        String datenEinzeln[] = datenZeile.split(";");

        String art = datenEinzeln[1];
        switch(art){
            case "Buch":
            String titel = datenEinzeln[0];
            String typ = datenEinzeln[1];
            Double preis = Double.parseDouble(datenEinzeln[2]);
            int jahr = Integer.parseInt(datenEinzeln[3]);
            int
            Buch buch = new Buch();
            soldBooks.add(buch);

            
        }
    }

}
