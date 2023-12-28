package Kortspil;

public class Card {

    private int rank;
    private String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        String ranks;
        switch (rank) {

            case 1:
                ranks = "Ace";
            case 11:
                ranks = "Jack";
            case 12:
                ranks = "Queen";
            case 13:
                ranks = "King";
                break;
            default:
                //ranks er en int men skal ændres til en toString
                ranks = Integer.toString(rank);

        }
        return ranks + " of " + suit;
    }
    public int getRank(){
        return rank;
    }
    public String getSuit(){
        return suit;
    }
}
