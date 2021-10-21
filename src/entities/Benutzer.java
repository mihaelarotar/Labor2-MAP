package entities;


import java.util.List;

/**
 * Representiert ein Benutzer der Anwendung.
 */
public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    /** Konstruktor der Klasse Benutzer
     * @param vorName Vorname des Benutzers
     * @param nachName Nachname des Benutzers
     * @param sport Liste der Lieblingssportstreibungen der Benutzers
     */
    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    /** getter fur den Vorname des Benutzers
     * @return string, der Vorname des Benutzers
     */
    public String getVorName() {
        return vorName;
    }

    /** setter fur den Vorname des Benutzers
     * @param vorName der Vorname des Benutzers
     */
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

    /**
     * kalkuliert die Gesamtzeit fur die Treibung aller Sporten in der Liste
     * @return double, die Gesamtzeit
     */
    public double kalkuliereZeit() {
        double total = 0;
        for(Sport s : sport)
            total += s.kalkuliereZeit();
        return total;
    }

    /*
    // kalkuliert die Durchschnittzeit fur einen Sport
    public double kalkuliereZeit(Sport s) {
        return s.kalkuliereZeit();
    }*/

    /**
     * kalkuliert die Gesamtzeit fur die Treibung eines bestimmten Sports
     * @param s ein bestimmter Sportart
     * @return double, Gesamtzeit fur die Treibung eines bestimmten Sports
     */
    public double kalkuliereZeit(Sport s) {
        double total = 0;
        for (Sport sport : sport)
            if (sport == s)
                total += sport.kalkuliereZeit();
        return total;
    }

    /**
     * kalkuliert die Durchschnittszeit fur die Treibung aller Sporten in der Liste
     * @return double, Durchschnittszeit fur die Treibung aller Sporten in der Liste
     */
    public double kalkuliereDurchschnittszeit() {
        if (sport.isEmpty())
            return 0;
        return kalkuliereZeit() / sport.size();
    }
}
