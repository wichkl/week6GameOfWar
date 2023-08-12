package week6GameOfWar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//to hold the list of Card objects
    private List<Card> cards;

    public Deck() {
    	//establish ArrayList that will hold the Card object
        cards = new ArrayList<>();
        
        //arrays for both suits and names
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        
        //enhanced for loop iterates through each suit
        for (String suit : suits) {
        	//for loop iterates through each possible value 2-14
            for (int value = 0; value < 13; value++) {
            	//assigns value to suit as well
                String name = names[value] + " of " + suit;
                cards.add(new Card(value, name));
            }
        }
    }

    public void shuffle() {
    	//method to shuffle the cards in the deck
        Collections.shuffle(cards);
    }

    public Card draw() {
    	//method that draws a card from the deck. removes and returns the first card in the "cards" list
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }
}
