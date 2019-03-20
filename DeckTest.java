import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

/**
 * The test class DeckTest.
 *
 * @author  Dave Avis
 * @version 3.19.2019
 */
public class DeckTest
{
    /**
     * Default constructor test
     */
    @Test(timeout=2000)
    public void deckConstructorTest()
    {
        Deck d = new Deck();
        assertEquals("Not enough cards created (-5 points)", 52, d.deckSize() );

        ArrayList<String> dealt = new ArrayList<String>();
        while( d.deckSize() > 0 )
        {
            String card = d.getTopCard().toString();
            assertFalse( "duplicate cards detected in the deck (-10 points)", dealt.contains( card ) );
            dealt.add( card );
        }
    }

    /**
     * Shuffle test.
     */
    @Test(timeout=2000)
    public void shuffleTest()
    {
        Deck d = new Deck();
        String unshuffled = d.toString();
        d.shuffle();
        assertNotEquals("shuffle did not shuffle (-15 points)", unshuffled, d.toString() );
    }

    /**
     * toString test.
     */
    @Test(timeout=2000)
    public void toStringTest()
    {
        Deck d = new Deck();
        String s = deck.toString();
        assertTrue("Deck toString failed (-10 points)", s.length() > 0 );
    }
}
