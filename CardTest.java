import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CardTest.
 *
 * @author  Dave Avis
 * @version 3.19.2019
 */
public class CardTest
{
    /**
     * Default constructor test
     */
    @Test(timeout=2000)
    public void defaultConstructorTest()
    {
        Card c = new Card();
        assertEquals( "default constructor failed (or getRank failed) (-10 points)", "", c.getRank() );
        assertEquals( "default constructor failed (or getSuit failed) (-10 points)", ' ', c.getSuit() );
    }

    /**
     * Constructor with parameters test
     */
    @Test(timeout=2000)
    public void paramConstructorTest()
    {
        Card c = new Card( "5", 'H' );
        assertEquals( "constructor with parameters failed (or getRank failed) (-10 points)", "5", c.getRank() );
        assertEquals( "constructor with parameters failed (or getSuit failed) (-10 points)", 'H', c.getSuit() );
    }

    /**
     * setRank test
     */
    @Test(timeout=2000)
    public void setRankTest()
    {
        Card c = new Card();
        c.setRank("Q");
        assertEquals( "setRank failed (or getRank failed) (-10 points)", "Q", c.getRank() );
    }

    /**
     * setSuit test
     */
    @Test(timeout=2000)
    public void setSuitTest()
    {
        Card c = new Card();
        c.setSuit('S');
        assertEquals( "setSuit failed (or getSuit failed) (-10 points)", 'S', c.getSuit() );
    }

    /**
     * toString test
     */
    @Test(timeout=2000)
    public void toStringTest()
    {
        Card c = new Card( "7", 'H' );
        assertEquals( "toString failed (-10 points)", "7H", c.toString() );
    }
}
