package week6GameOfWar;

public class Card {
	//establish private fields to. value - numeric value of card. name - full name of the card
    private int value;
    private String name;

    public Card(int value, String name) {
    	//initialize the card object
        this.value = value;
        this.name = name;
    }

    public void describe() {
    	//print the name of the card
        System.out.println(name);
    }

    public int getValue() {
    	//returns the value of the card
        return value;
    }

    public String getName() {
    	//returns the name of the card
        return name;
    }
}
