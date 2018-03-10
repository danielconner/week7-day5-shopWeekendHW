public class DrumStick extends NonPlayableStock implements Sellable {

    private String material;

    public DrumStick(String name, double buyPrice, double sellPrice, int quantity, String material) {
        super(name, buyPrice, sellPrice, quantity);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public double calculateMarkup() {
        return (getSellPrice() - getBuyPrice());
    }


}
