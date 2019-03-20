/**
 * This class is where you can test the Card and Deck classes.
 * You do not need to edit this class, but you may.
 *
 * @author Dave Avis
 * @version 3.19.2019
 */
public class Runner
{
    /**
     * Create a deck and print it out both before and after shuffling.
     *
     * @param args not used
     */
    public static void main( String[] args )
    {
        Deck d = new Deck();

        System.out.println( d );
        d.shuffle();
        System.out.println( d );
    }
}
