package week6GameOfWar;

public class App {

    public static void main(String[] args) {
    	//creating a deck and establishing player names
        Deck deck = new Deck();
        Player player1 = new Player("William");
        Player player2 = new Player("Chris");

        deck.shuffle();

        //"distributes" the cards to players
        for (int i = 0; i < 52; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        //loop for flipping cards each turn
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            //establishes the turn, card holder, and card name
            System.out.println("Turn " + (i + 1));
            System.out.print("William's card: ");
            card1.describe();
            System.out.print("Chris' card: ");
            card2.describe();
            
            //calls increment score method every turn establishes who wins
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println("William wins this turn!");
            } else if (card2.getValue() > card1.getValue()) {
                player2.incrementScore();
                System.out.println("Chris wins this turn!");
            } else {
                System.out.println("It's a tie!");
            }
            //keep the player's total score updated every round
            System.out.println("William's current score: " + player1.getScore());
            System.out.println("Chris' current score: " + player2.getScore());
            System.out.println("------------------------");
        }

        //final score results
        System.out.println("Final Scores:");
        player1.describe();
        player2.describe();

        if (player1.getScore() > player2.getScore()) {
            System.out.println("William wins the game!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("Chris wins the game!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
