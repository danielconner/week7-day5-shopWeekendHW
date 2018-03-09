import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp(){
        sheetMusic = new SheetMusic("Elton Johns Greatest Hits", 3.50, 9.99, 10, "Penguin");
    }


    @Test
    public void canGetName() {
        assertEquals("Elton Johns Greatest Hits", sheetMusic.getName());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(3.50, sheetMusic.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(9.99, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void canGetQuantity() {
        assertEquals(10, sheetMusic.getQuantity());
    }

    @Test
    public void canGetPublisher() {
        assertEquals("Penguin", sheetMusic.getPublisher());
    }
}
