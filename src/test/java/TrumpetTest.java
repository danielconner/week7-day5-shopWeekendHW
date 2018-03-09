import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() {
        trumpet = new Trumpet("Trumpet", "Elkhart", "100Tr", "Goldust", InstrumentFamilyType.WIND, 79.99, 137.78, 8, 5);
    }


    @Test
    public void canGetInstrumentType() {
        assertEquals("Trumpet", trumpet.getInstrumentType());
    }

    @Test
    public void canGetMake() {
        assertEquals("Elkhart", trumpet.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("100Tr", trumpet.getModel());
    }

    @Test
    public void canGetColour() {
        assertEquals("Goldust", trumpet.getColour());
    }

    @Test
    public void canGetInstrumentFamilyType() {
        assertEquals("wind", trumpet.getFamilyType());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(79.99, trumpet.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(137.78, trumpet.getSellPrice(), 0.01);
    }

    @Test
    public void canGetQuantity() {
        assertEquals(8, trumpet.getQuantity());
    }

    @Test
    public void canGetNumberOfValves() {
        assertEquals(5, trumpet.getNumberOfValues());
    }
}
