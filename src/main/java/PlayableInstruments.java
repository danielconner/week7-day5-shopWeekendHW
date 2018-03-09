public abstract class PlayableInstruments {

    private String instrumentType;
    private String make;
    private String model;
    private String colour;
    private InstrumentFamilyType familyType;
    private double buyPrice;
    private double sellPrice;
    private int quantity;

    public PlayableInstruments(String instrumentType, String make, String model, String colour, InstrumentFamilyType familyType, double buyPrice, double sellPrice, int quantity) {
        this.instrumentType = instrumentType;
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.familyType = familyType;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.quantity = quantity;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public String getFamilyType() {
        return this.familyType.getFamilyType();
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