public class Bass extends PlayableInstruments implements Playable, Sellable{

    private int numberOfStrings;

    public Bass(String instrumentType, String make, String model, String colour, InstrumentFamilyType familyType, double buyPrice, double sellPrice, int quantity, int numberOfStrings) {
        super(instrumentType, make, model, colour, familyType, buyPrice, sellPrice, quantity);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
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
