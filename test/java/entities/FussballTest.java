package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FussballTest {

    @Test
    void kalkuliereZeit() {
        Fussball football = new Fussball();
        assertEquals(football.kalkuliereZeit(), 65);
    }
}