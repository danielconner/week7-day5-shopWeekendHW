public abstract class NonPlayableStock {

    private String name;
    private double buyPrice;
    private double sellPrice;
    private int quantity;

    public NonPlayableStock(String name, double buyPrice, double sellPrice, int quantity) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
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
