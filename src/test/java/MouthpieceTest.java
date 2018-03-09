import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouthpieceTest {

    Mouthpeice mouthpiece;

    @Before
    public void setUp(){
        mouthpiece = new Mouthpeice("Rico Trumpet Mouthpiece", 25.99, 58.99, 5, "Silver");
    }


    @Test
    public void canGetName() {
        assertEquals("Rico Trumpet Mouthpiece", mouthpiece.getName());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(25.99, mouthpiece.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(58.99, mouthpiece.getSellPrice(), 0.01);
    }

    @Test
    public void canGetQuantity() {
        assertEquals(5, mouthpiece.getQuantity());
    }

    @Test
    public void canGetColour() {
        assertEquals("Silver", mouthpiece.getColour());
    }
}
