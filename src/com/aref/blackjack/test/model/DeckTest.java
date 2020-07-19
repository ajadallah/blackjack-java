package com.aref.blackjack.test.model;

import com.aref.blackjack.java.model.Deck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeckTest {

	@Test
	public void createFullDeckTest() {
		Deck classUnderTest = new Deck();

		// Create Deck
		classUnderTest.createFullDeck();

		assertTrue(classUnderTest.cards.size() > 0);
		assertEquals(52, classUnderTest.cards.size());
	}
}
