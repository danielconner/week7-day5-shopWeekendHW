public abstract class PlayableInstruments {

        private String material;
        private String colour;
        private InstrumentFamilyType familyType;
        private double buyPrice;
        private double sellPrice;
        private int quantity;

    public PlayableInstruments(String material, String colour, InstrumentFamilyType familyType, double buyPrice, double sellPrice, int quantity) {
        this.material = material;
        this.colour = colour;
        this.familyType = familyType;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.quantity = quantity;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentFamilyType getFamilyType() {
        return familyType;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
