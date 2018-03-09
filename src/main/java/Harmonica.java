public class Harmonica extends PlayableInstruments implements Playable{

    private String harmonicaCatagory;

    public Harmonica(String instrumentType, String make, String model, String colour, InstrumentFamilyType familyType, double buyPrice, double sellPrice, int quantity, String harmonicaCatagory) {
        super(instrumentType, make, model, colour, familyType, buyPrice, sellPrice, quantity);
        this.harmonicaCatagory = harmonicaCatagory;
    }

    public String getHarmonicaCatagory() {
        return harmonicaCatagory;
    }

    @Override
    public String play() {
        return getInstrumentType() + " is being played";
    }
}
