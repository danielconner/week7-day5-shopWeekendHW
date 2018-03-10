import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Trumpet trumpet;
    Harmonica harmonica;
    Mouthpeice mouthpeice;

    @Before
    public void setUp(){
        guitar = new Guitar("Guitar", "Epiphone", "Les Paul", "Sunburst", InstrumentFamilyType.PLUCKED_STRING, 89.99, 259.99, 10, 6);
        trumpet = new Trumpet("Trumpet", "Elkhart", "100Tr", "Goldust", InstrumentFamilyType.WIND, 79.99, 137.78, 8, 5);
        harmonica = new Harmonica("Harmonica", "Suzuki", "Hammond", "Steel Grey", InstrumentFamilyType.WIND, 9.00, 28.00, 5, "Detonic");
        mouthpeice = new Mouthpeice("Rico Trumpet Mouthpiece", 25.99, 58.99, 5, "Silver");
        ArrayList<Sellable> stock = new ArrayList<>();
        stock.add(guitar);
        stock.add(trumpet);
        stock.add(harmonica);
        stock.add(mouthpeice);
        shop = new Shop("Auld Dannys Harmonica Haberdashery", stock, 0.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Auld Dannys Harmonica Haberdashery", shop.getName());
    }

    @Test
    public void canGetTotalSales() {
        assertEquals(0.00, shop.getTotalSales(), 0.01);
    }

    @Test
    public void canCheckCurrentStockLevels(){
        assertEquals(4, shop.stockSize());
    }

    @Test
    public void canAddItemToStock(){
        StringPacks stringPacks = new StringPacks("Guitar Strings", 2.50, 7.50, 25, "Coopers");
        shop.addStock(stringPacks);
        assertEquals(5, shop.stockSize());
    }

    @Test
    public void canRemoveItemFromStock(){
        assertEquals(4, shop.stockSize());
        shop.removeStock(guitar);
        assertEquals(3, shop.stockSize());
    }

    @Test
    public void  totalProfitStockValue(){
        guitar = new Guitar("Guitar", "Epiphone", "Les Paul", "Sunburst", InstrumentFamilyType.PLUCKED_STRING, 89.99, 259.99, 10, 6);
        trumpet = new Trumpet("Trumpet", "Elkhart", "100Tr", "Goldust", InstrumentFamilyType.WIND, 79.99, 137.78, 8, 5);
        harmonica = new Harmonica("Harmonica", "Suzuki", "Hammond", "Steel Grey", InstrumentFamilyType.WIND, 9.00, 28.00, 5, "Detonic");
        mouthpeice = new Mouthpeice("Rico Trumpet Mouthpiece", 25.99, 58.99, 5, "Silver");
        ArrayList<Sellable> stock = new ArrayList<>();
        stock.add(guitar);
        stock.add(trumpet);
        stock.add(harmonica);
        stock.add(mouthpeice);
        assertEquals(279.79, shop.totalProfitStockValue(stock), 0.01);
    }
}
