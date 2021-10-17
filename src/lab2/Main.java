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
        List<Sport> sports = new ArrayList<>(Arrays.asList(basketball, football, lauf, sprung));
        Benutzer tom = new Benutzer("Tom", "Jones", sports);
        System.out.println(tom.kalkuliereZeit());
        System.out.println(tom.kalkuliereZeit(football));
        System.out.println(tom.kalkuliereZeit(sprung));
        System.out.println(tom.kalkuliereDurchschnittszeit());
        System.out.println(tom.getNachName());
        System.out.println(tom.getVorName());
        tom.setVorName("Tomas");
        System.out.println(tom.getVorName());
    }
}
