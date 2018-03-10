public class Trumpet extends PlayableInstruments implements Playable, Sellable{

    private int numberOfValues;

    public Trumpet(String instrumentType, String make, String model, String colour, InstrumentFamilyType familyType, double buyPrice, double sellPrice, int quantity, int numberOfValues) {
        super(instrumentType, make, model, colour, familyType, buyPrice, sellPrice, quantity);
        this.numberOfValues = numberOfValues;
    }

    public int getNumberOfValues() {
        return numberOfValues;
    }

    @Override
    public String play() {
        return getInstrumentType() + " is being played";
    }

    @Override
    public double calculateMarkup() {
        return (getSellPrice() - getBuyPrice());
    }
}
