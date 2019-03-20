import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Deck
{
    // instance variable
    private ArrayList<Card> deck;

    // constructor
    public Deck()
    {
        deck = new ArrayList<Card>();

        // make a String array of ranks ("A", "2", "3", ..., "J", "Q", "K")
        // make a char array of suits ('H', 'D', 'S', 'C')


        // add one of each card to the deck
        // you'll probably want to use 2 for loops that are nested

    }

    // shuffle the deck
    // you may want to use the method deckSize() below to help you.
    // 1. create a new empty ArrayList to hold the shuffled cards.
    // 2. get a random location in the unshuffled deck
    // 3. add the card at that location to the shuffled deck
    // 4. remove the same card from the unshuffled deck
    // 5. after moving all of the cards from the unshuffled deck to the shuffled deck,
    //    set the instance variable "deck" to be the shuffled deck (i.e. deck = shuffledDeck)
    //
    // to get a random integer from 0 until 10 (including 0, not including 10):
    // int randInt = ThreadLocalRandom.current().nextInt(0, 10);
    public void shuffle()
    {
    }

    /**
     * Returns the number of cards remaining in the deck.
     * You do not need to edit this method.
     *
     * @return the number of cards remaining in the deck
     */
    public int deckSize()
    {
        return deck.size();
    }

    /**
     * returns the top card off the deck and removes it from the deck
     *
     * @return the top card off the deck
     */
    public Card getTopCard()
    {
        return deck.remove(0);
    }

    // return a string containing all of the cards in the deck
    // example: 2H 5C 9S
    public String toString()
    {
        String out = "";

        return out;
    }
}
