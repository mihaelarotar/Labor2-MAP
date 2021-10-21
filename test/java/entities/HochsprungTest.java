package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HochsprungTest {

    @Test
    void kalkuliereZeit() {
        Hochsprung sprung = new Hochsprung();
        assertEquals(sprung.kalkuliereZeit(), 20);
    }
}