package week6GameOfWar;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//list to hold the players hand, keep score, and stores the name of the player
    private List<Card> hand;
    private int score;
    private String name;

    public Player(String name) {
    	//initiallize name field, set up an empty arraylist for the hand, set score to 0
        this.name = name;
        hand = new ArrayList<>();
        score = 0;
    }

    public void describe() {
    	//method for printing player information
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
    	//how we simulate flipping card over and removing them from the deck
        if (hand.isEmpty()) {
            return null;
        }
        return hand.remove(0);
    }

    public void draw(Deck deck) {
    	//so the player can "draw" a card and add it to their ArrayList
        Card card = deck.draw();
        if (card != null) {
            hand.add(card);
        }
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}