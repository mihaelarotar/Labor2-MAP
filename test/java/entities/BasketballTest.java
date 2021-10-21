package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketballTest {

    @Test
    void kalkuliereZeit() {
        Basketball basket = new Basketball();
        assertEquals(basket.kalkuliereZeit(), 55);
    }
}