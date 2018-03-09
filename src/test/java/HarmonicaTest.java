import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarmonicaTest {

    Harmonica harmonica;

    @Before
    public void setUp(){
        harmonica = new Harmonica("Harmonica", "Suzuki", "Hammond", "Steel Grey", InstrumentFamilyType.WIND, 9.00, 28.00, 5, "Detonic");
    }


    @Test
    public void canGetInstrumentType() {
        assertEquals("Harmonica", harmonica.getInstrumentType());
    }

    @Test
    public void canGetMake() {
        assertEquals("Suzuki", harmonica.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Hammond", harmonica.getModel());
    }

    @Test
    public void canGetColour() {
        assertEquals("Steel Grey", harmonica.getColour());
    }

    @Test
    public void canGetInstrumentFamilyType() {
        assertEquals("wind", harmonica.getFamilyType());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(9.00, harmonica.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(28, harmonica.getSellPrice(), 0.01);
    }

    @Test
    public void canGetQuantity() {
        assertEquals(5, harmonica.getQuantity());
    }

    @Test
    public void canHarmonicaCatagory() {
        assertEquals("Detonic", harmonica.getHarmonicaCatagory());
    }
}
