public class SheetMusic extends NonPlayableStock {

    private String publisher;

    public SheetMusic(String name, double buyPrice, double sellPrice, int quantity, String publisher) {
        super(name, buyPrice, sellPrice, quantity);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
}
