public class Piano extends PlayableInstruments{

    private int numberOfKeys;

    public Piano(String instrumentType, String make, String model, String colour, InstrumentFamilyType familyType, double buyPrice, double sellPrice, int quantity, int numberOfKeys) {
        super(instrumentType, make, model, colour, familyType, buyPrice, sellPrice, quantity);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
