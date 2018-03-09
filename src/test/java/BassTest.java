import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassTest {
    Bass bass;

    @Before
    public void setUp() {
        bass = new Bass("Bass", "Ibanez", "SR1805", "Twilight Grey", InstrumentFamilyType.PLUCKED_STRING, 400.00, 1034.98, 2, 4);
    }


    @Test
    public void canGetInstrumentType() {
        assertEquals("Bass", bass.getInstrumentType());
    }

    @Test
    public void canGetMake() {
        assertEquals("Ibanez", bass.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("SR1805", bass.getModel());
    }

    @Test
    public void canGetColour() {
        assertEquals("Twilight Grey", bass.getColour());
    }

    @Test
    public void canGetInstrumentFamilyType() {
        assertEquals("plucked string", bass.getFamilyType());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(400.00, bass.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(1034.98, bass.getSellPrice(), 0.01);
    }

    @Test
    public void canGetQuantity() {
        assertEquals(2, bass.getQuantity());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(4, bass.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Bass is being played", bass.play());
    }
}
