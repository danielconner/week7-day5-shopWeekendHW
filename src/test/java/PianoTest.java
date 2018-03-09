import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Piano", "Yamaha", "Calinova", "Black", InstrumentFamilyType.KEYBOARD, 109.59, 258.99, 15, 128);
    }


    @Test
    public void canGetInstrumentType() {
        assertEquals("Piano", piano.getInstrumentType());
    }

    @Test
    public void canGetMake() {
        assertEquals("Yamaha", piano.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Calinova", piano.getModel());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void canGetInstrumentFamilyType() {
        assertEquals("keyboard", piano.getFamilyType());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(109.59, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(258.99, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canGetQuantity() {
        assertEquals(15, piano.getQuantity());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(128, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Piano is being played", piano.play());
    }
}
