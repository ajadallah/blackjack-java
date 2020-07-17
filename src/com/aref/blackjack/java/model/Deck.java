package com.aref.blackjack.java.model;

import java.util.ArrayList;

public class Deck {
    public ArrayList<Card> cards;

    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void createFullDeck() {

    }

    public void shuffle() {

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
        return "Deck{" +
                "cards=" + cards +
                '}';
    }
}
