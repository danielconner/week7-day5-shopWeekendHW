import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drums drums;

    @Before
    public void setUp(){
        drums = new Drums("Drums", "Mapex", "Armoury", "Desert Dune", InstrumentFamilyType.PERCUSSION, 378.78, 689.99, 1, 7);
    }


    @Test
    public void canGetInstrumentType() {
        assertEquals("Drums", drums.getInstrumentType());
    }

    @Test
    public void canGetMake() {
        assertEquals("Mapex", drums.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Armoury", drums.getModel());
    }

    @Test
    public void canGetColour() {
        assertEquals("Desert Dune", drums.getColour());
    }

    @Test
    public void canGetInstrumentFamilyType() {
        assertEquals("percussion", drums.getFamilyType());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(378.78, drums.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(689.99, drums.getSellPrice(), 0.01);
    }

    @Test
    public void canGetQuantity() {
        assertEquals(1, drums.getQuantity());
    }

    @Test
    public void canGetNumberOfDrums() {
        assertEquals(7, drums.getNumberOfDrums());
    }
}
