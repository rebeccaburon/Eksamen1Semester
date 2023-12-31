package Kortspil;

import java.util.ArrayList;
import java.util.Collections;


//som repræsenterer et spil kort.
public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        for (String suit : suits) {
            //4 kulør/suits *13 rækker
            for (int ranks = 1; ranks <= 13; ranks++) {
                cards.add(new Card(ranks, suit));
            }
        }
        // Tilfældigt kort
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            return null; // Deck is empty
        }
        Card drawnCard = cards.remove(0);
        return drawnCard;
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    public void addCard() {

    }

    public void remove() {

    }


    public ArrayList<Card> getCards() {
        return cards;
    }
}
