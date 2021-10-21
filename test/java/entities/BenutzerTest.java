package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class BenutzerTest {

    @Test
    void kalkuliereZeit() {
        Benutzer x = new Benutzer("", "", null);
        List<Sport> sportList = new ArrayList<>();
        x.setSport(sportList);
        assertEquals(x.kalkuliereZeit(), 0);

        Basketball b = new Basketball();
        Fussball f = new Fussball();
        sportList.add(b);
        sportList.add(f);

        assertEquals(x.kalkuliereZeit(), 120);

        sportList.add(f);
        assertEquals(x.kalkuliereZeit(), 185);
    }

    @Test
    void testKalkuliereZeit() {
        Benutzer x = new Benutzer("", "", null);
        List<Sport> sportList = new ArrayList<>();
        x.setSport(sportList);
        assertEquals(x.kalkuliereZeit(new Basketball()), 0);

        Basketball b = new Basketball();
        sportList.add(b);
        assertEquals(x.kalkuliereZeit(b), new Basketball().kalkuliereZeit());

        sportList.add(b);
        assertEquals(x.kalkuliereZeit(b), new Basketball().kalkuliereZeit()*2);
    }

    @Test
    void kalkuliereDurchschnittszeit() {
        Benutzer x = new Benutzer("", "", null);
        List<Sport> sportList = new ArrayList<>();
        x.setSport(sportList);
        assertEquals(x.kalkuliereDurchschnittszeit(), 0);

        sportList.add(new Basketball());
        sportList.add(new Hochsprung());
        assertEquals(x.kalkuliereDurchschnittszeit(), 37.5);

        sportList.add(new Fussball());
        sportList.add(new Hindernislauf());
        assertEquals(x.kalkuliereDurchschnittszeit(), 42.5);
    }
}