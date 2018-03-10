import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringPackTest {

    StringPacks stringPacks;

    @Before
    public void setUp(){
        stringPacks = new StringPacks("Guitar Strings", 2.50, 7.50, 25, "Coopers");
    }

    @Test
    public void canGetName() {
        assertEquals("Guitar Strings", stringPacks.getName());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(2.50, stringPacks.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(7.50, stringPacks.getSellPrice(), 0.01);
    }

    @Test
    public void canGetQuantity() {
        assertEquals(25, stringPacks.getQuantity());
    }

    @Test
    public void canGetBrand() {
        assertEquals("Coopers", stringPacks.getBrand());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(5, stringPacks.calculateMarkup(), 0.01);
    }
}
