package grade12examples;

import java.awt.Color;

/**
 *
 * @author tarra7926
 */
public class Card {

    //instace (class) variables/fields
    private int suit;
    private int rank;
    private Color colour;
    private boolean isVisible;
    //class constants
    public static final int SPADES = 0;
    public static final int CLUBS = 1;
    public static final int HEARTS = 2;
    public static final int DIAMONDS = 3;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 1;

    //constructor for cards
    //initializa variables and such
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
        this.isVisible = false;

        if (suit == CLUBS || suit == SPADES) {
            this.colour = Color.BLACK;
        } else {
            this.colour = Color.RED;
        }
    }
    //suit accessor (getter) method

    public int getSuit() {
        return this.suit;
    }

    public int getRank() {
        return this.rank;
    }

    public Color getColour() {
        return this.colour;
    }

    public boolean isVisible() {
        return this.isVisible;
    }
    //flipthe card

    public void flip() {
        //called a toggle
        this.isVisible = !this.isVisible;
    }
    //format of printing a card

    @Override
    public String toString() {
        String card = "";
        if (this.rank >= 2 && this.rank <= 10) {
            card = card + this.rank + " of ";
        } else if (this.rank == ACE) {
            card = card + "Ace of ";
        } else if (this.rank == JACK) {
            card = card + "Jack of ";
        } else if (this.rank == QUEEN) {
            card = card + "Queen of ";
        } else if (this.rank == KING) {
            card = card + "King of ";
        }
        if(this.suit == SPADES){
            card = card + "Spades";
        }if(this.suit == DIAMONDS){
            card = card + "Diamonds";
        }if(this.suit == CLUBS){
            card = card + "Clubs";
        }if(this.suit == HEARTS){
            card = card + "Hearts";
        }
        
        return card;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card c1 = new Card(5, Card.DIAMONDS);
        Card c2 = new Card(10, Card.SPADES);
        Card c3 = new Card(Card.ACE, Card.SPADES);
        c1.flip();
        System.out.println("c1 is visible:" + c1.isVisible());
        System.out.println("c1 is visible:" + c2.isVisible());
System.out.println(c1);
        System.out.println(c3);
    }
}
