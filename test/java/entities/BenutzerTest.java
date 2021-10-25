package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class BenutzerTest {

    @Test
    void kalkuliereZeit() {
        Benutzer user = new Benutzer(null, null, null);
        List<Sport> sportList = new ArrayList<>();
        user.setSport(sportList);
        assertEquals(user.kalkuliereZeit(), 0);

        Basketball basket = new Basketball();
        Fussball football = new Fussball();
        sportList.add(basket);
        sportList.add(football);

        assertEquals(user.kalkuliereZeit(), 120);

        sportList.add(football);
        assertEquals(user.kalkuliereZeit(), 185);
    }

    @Test
    void testKalkuliereZeit() {
        Benutzer user = new Benutzer(null, null, null);
        List<Sport> sportList = new ArrayList<>();
        user.setSport(sportList);
        assertEquals(user.kalkuliereZeit(new Basketball()), 0);

        Basketball basket = new Basketball();
        sportList.add(basket);
        assertEquals(user.kalkuliereZeit(basket), new Basketball().kalkuliereZeit());

        sportList.add(basket);
        assertEquals(user.kalkuliereZeit(basket), new Basketball().kalkuliereZeit()*2);
    }

    @Test
    void kalkuliereDurchschnittszeit() {
        Benutzer user = new Benutzer("", "", null);
        List<Sport> sportList = new ArrayList<>();
        user.setSport(sportList);
        assertEquals(user.kalkuliereDurchschnittszeit(), 0);

        sportList.add(new Basketball());
        sportList.add(new Hochsprung());
        assertEquals(user.kalkuliereDurchschnittszeit(), 37.5);

        sportList.add(new Fussball());
        sportList.add(new Hindernislauf());
        assertEquals(user.kalkuliereDurchschnittszeit(), 42.5);
    }
}