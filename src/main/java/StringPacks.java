public class StringPacks extends NonPlayableStock {

    private String brand;

    public StringPacks(String name, double buyPrice, double sellPrice, int quantity, String brand) {
        super(name, buyPrice, sellPrice, quantity);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
