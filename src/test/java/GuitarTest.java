import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Guitar", "Epiphone", "Les Paul", "Sunburst", InstrumentFamilyType.PLUCKED_STRING, 89.99, 259.99, 10, 6);

    }

    @Test
    public void canGetInstrumentType() {
        assertEquals("Guitar", guitar.getInstrumentType());
    }

    @Test
    public void canGetMake() {
        assertEquals("Epiphone", guitar.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Les Paul", guitar.getModel());
    }

    @Test
    public void canGetColour() {
        assertEquals("Sunburst", guitar.getColour());
    }

    @Test
    public void canGetInstrumentFamilyType() {
        assertEquals("plucked string", guitar.getFamilyType());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(89.99, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(259.99, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canGetQuantity() {
        assertEquals(10, guitar.getQuantity());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Guitar is being played", guitar.play());
    }
}
