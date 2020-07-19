package com.aref.blackjack.java.model;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	public ArrayList<Card> cards;

	public Deck() {
		this.cards = new ArrayList<Card>();
	}

	public void createFullDeck() {
		for (Suit cardSuit : Suit.values()) {
			for (Value cardValue : Value.values()) {
				cards.add(new Card(cardSuit, cardValue));
			}
		}

	}

	public void shuffle() {
		ArrayList<Card> tempDeck = new ArrayList<Card>();
		// Use Random
		Random random = new Random();
		int randomCardIndex = 0;
		int originalSize = this.cards.size();

		for (int i = 0; i < originalSize; i++) {
			// Generate Random Index rand.nextInt((max - min) + min;
			randomCardIndex = random.nextInt((this.cards.size() - 1 - 0) + 1) + 0;
			tempDeck.add(this.cards.get(randomCardIndex));
			this.cards.remove(randomCardIndex);
		}
		this.cards = tempDeck;
	}

	public void removeCard() {

	}

	public Card getCard() {
		return null;
	}

	public int cardsValue() {
		return 0;
	}

	public void draw() {

	}

	public int deckSize() {
		return 0;
	}

	public void moveAllToDeck() {

	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		String cardListOutput = "";
		int i = 0;
		for (Card card : this.cards) {
			cardListOutput += "\n" + i + " - " + card.toString();
			i++;
		}
		return cardListOutput;
	}
}
