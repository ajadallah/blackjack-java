package com.aref.blackjack.test.model;

import com.aref.blackjack.java.model.Deck;
import com.aref.blackjack.java.model.Suit;
import org.junit.jupiter.api.Test;

import static com.aref.blackjack.java.model.Value.ACE;
import static com.aref.blackjack.java.model.Value.TWO;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeckTest {

	@Test
	public void createFullDeckTest() {
		// Create Deck
		Deck classUnderTest = new Deck();
		classUnderTest.createFullDeck();

		assertTrue(classUnderTest.cards.size() > 0);
		assertEquals(52, classUnderTest.cards.size());
	}

	@Test
	public void shuffleTest() {
		// Create Deck
		Deck classUnderTest = new Deck();
		classUnderTest.createFullDeck();
		classUnderTest.shuffle();

		// Simple tests that may actually fail occasionally due to randomness
		assertEquals(true, (classUnderTest.cards.get(0).getValue() != TWO)
						&& (classUnderTest.cards.get(0).getSuit() != Suit.CLUBS));

		assertEquals(true, (classUnderTest.cards.get(51).getValue() != ACE)
						&& (classUnderTest.cards.get(51).getSuit() != Suit.HEARTS));

	}


}
