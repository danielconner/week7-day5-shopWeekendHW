public class SheetMusic extends NonPlayableStock implements Sellable {

    private String publisher;

    public SheetMusic(String name, double buyPrice, double sellPrice, int quantity, String publisher) {
        super(name, buyPrice, sellPrice, quantity);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public double calculateMarkup() {
        return (getSellPrice() - getBuyPrice());
    }
}
