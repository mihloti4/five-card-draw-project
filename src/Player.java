import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private Deck deck;
    private Ranking rank;
    private Poker poker = new Poker();

    /**
     * Constructor to instantiate a player. Specifies the dealing size for the player's deck object.
     *
     * @param handSize the amount of cards which the player can have per game.
     */
    public Player(int handSize) {
        this.deck = new Deck(handSize);
        this.rank = new Ranking();
    }

    /**
     * method to evaluate the player's hand to determine it's strength.
     *
     * @return a string which represents the player's hand strength.
     */
    public String evaluate() {
        return this.rank.evaluateHand(this.hand);
    }

    /**
     * method to draw cards to the players hand. Invokes the deck's dealCards method.
     * Shuffles the deck to increase card order randomness.
     */
    public void drawCards() {
        this.deck.shuffle();
        this.hand = this.poker.sortHandCards(this.deck.dealCards());
    }

    public void printHand() {
        for (Card card : this.hand) {
            card.printCard();
        }
        System.out.println();
    }

    public void printPlayerRank(){
        System.out.println(this.evaluate());
    }

    public Deck getGameDeck(){
        return this.deck;
    }

    public ArrayList<Card> getPlayerHand() {
        return this.hand;
    }

}