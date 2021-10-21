package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HindernislaufTest {

    @Test
    void kalkuliereZeit() {
        Hindernislauf lauf = new Hindernislauf();
        assertEquals(lauf.kalkuliereZeit(), 30);
    }
}