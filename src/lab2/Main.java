package lab2;

import entities.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Mannschaftssport basketball = new Basketball();
        Mannschaftssport football = new Fussball();
        Leichtathletik lauf = new Hindernislauf();
        Leichtathletik sprung = new Hochsprung();
        List<Sport> sports = new ArrayList<>(Arrays.asList(basketball, football, lauf, sprung, basketball));
        Benutzer tom = new Benutzer(null, null, null);
        tom.setVorName("Tom");
        tom.setNachName("Jones");
        tom.setSport(sports);
        System.out.println("Gesamtzeit fur alle Sporte: " +  tom.kalkuliereZeit());
        System.out.println("Gesamtzeit fur Basketball: " + tom.kalkuliereZeit(basketball));
        System.out.println("Gesamtzeit fur Hochsprung: "  + tom.kalkuliereZeit(sprung));
        System.out.println("Durchschnittzeit fur alle Sporte - Tom: " + tom.kalkuliereDurchschnittszeit());
        System.out.println("Der Nachname des Benutzers ist " + tom.getNachName());
        System.out.println("Der Vorname des Benutzers ist " + tom.getVorName());
        tom.setVorName("Tomas");
        System.out.println("Der neue Vorname des Benutzers ist " + tom.getVorName());
        Benutzer jerry = new Benutzer("Jerry", "Maguire", tom.getSport());
        System.out.println("Durchschnittzeit fur alle Sporte - Jerry: " + jerry.kalkuliereDurchschnittszeit());
    }
}
