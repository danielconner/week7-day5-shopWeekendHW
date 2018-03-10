public class Mouthpeice extends NonPlayableStock implements Sellable {

    private String colour;

    public Mouthpeice(String name, double buyPrice, double sellPrice, int quantity, String colour) {
        super(name, buyPrice, sellPrice, quantity);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double calculateMarkup() {
        return (getSellPrice() - getBuyPrice());
    }
}
