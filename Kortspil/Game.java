package Kortspil;

import java.util.Collections;

public class Game {
    private TextUI ui = new TextUI();
    private Deck deck;

    public Game() {
        deck = new Deck();

    }

    public void gameDialog() {
        ui.displayMsg("Let's play a game!");
        Card userCard = drawCard();
        Card computerCard = drawCard();

        ui.displayMsg("\nYour card is: " + userCard + "\nAnd the computers card is: " + computerCard);

        Card winner = highest(userCard, computerCard);

        if (winner == userCard) {
            ui.displayMsg("Congrats! You won!");
        } else if (winner == computerCard) {
            ui.displayMsg("The computer won");
        } else {
            ui.displayMsg("It's a tie!");
        }
    }


    public Card drawCard() {
        return deck.drawCard();
    }

    public Card highest(Card card1, Card card2) {
        if (card1.getRank() > card2.getRank()) {
            return card1;
        } else if (card1.getRank() < card2.getRank()) {
            return card2;
        } else {
            // If ranks are equal, compare suits
            if (card1.getSuit().compareTo(card2.getSuit()) > 0) {
                return card1;
            } else {
                return card2;
            }
        }


    }


}
