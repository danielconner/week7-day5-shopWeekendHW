import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void setUp(){
        drumStick = new DrumStick("Replacement drum sticks", 1.50, 12.99, 50, "Wood");
    }


    @Test
    public void canGetName() {
        assertEquals("Replacement drum sticks", drumStick.getName());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(1.50, drumStick.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(12.99, drumStick.getSellPrice(), 0.01);
    }

    @Test
    public void canGetQuantity() {
        assertEquals(50, drumStick.getQuantity());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", drumStick.getMaterial());
    }
}
