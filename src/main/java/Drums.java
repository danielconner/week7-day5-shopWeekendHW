public class Drums extends PlayableInstruments{

    private int numberOfDrums;

    public Drums(String instrumentType, String make, String model, String colour, InstrumentFamilyType familyType, double buyPrice, double sellPrice, int quantity, int numberOfDrums) {
        super(instrumentType, make, model, colour, familyType, buyPrice, sellPrice, quantity);
        this.numberOfDrums = numberOfDrums;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }
}
