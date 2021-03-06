public class Drums extends PlayableInstruments implements Playable, Sellable{

    private int numberOfDrums;

    public Drums(String instrumentType, String make, String model, String colour, InstrumentFamilyType familyType, double buyPrice, double sellPrice, int quantity, int numberOfDrums) {
        super(instrumentType, make, model, colour, familyType, buyPrice, sellPrice, quantity);
        this.numberOfDrums = numberOfDrums;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    @Override
    public String play() {
        return getInstrumentType() + " are being played";
    }

    @Override
    public double calculateMarkup() {
        return (getSellPrice() - getBuyPrice());
    }
}
