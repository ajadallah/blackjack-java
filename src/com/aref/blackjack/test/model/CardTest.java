package com.aref.blackjack.test.model;

import com.aref.blackjack.java.model.Card;
import org.junit.jupiter.api.Test;

import static com.aref.blackjack.java.model.Suit.SPADES;
import static com.aref.blackjack.java.model.Value.ACE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardTest {

    @Test
    public void cardTest() {
        Card aceOfSpades = new Card(SPADES, ACE);
        assertEquals(SPADES, aceOfSpades.getSuit());
        assertEquals(ACE, aceOfSpades.getValue());
        assertEquals("Your card is the ace of spades", aceOfSpades.toString());
    }

}
