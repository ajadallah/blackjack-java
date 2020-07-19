package com.aref.blackjack.java;

import com.aref.blackjack.java.model.Deck;

public class Blackjack {
	public static void main(String[] args) {
		// Welcome message
		System.out.println("Welcome to Blackjack");

		// Create Deck
		Deck deck = new Deck();
		deck.createFullDeck();
		deck.shuffle();

		System.out.println(deck
						.toString());
	}
}
