public enum InstrumentFamilyType {

    WIND("wind"),
    PLUCKED_STRING("plucked string"),
    KEYBOARD("keyboard"),
    PERCUSSION("percussion");

    private final String familyType;

    InstrumentFamilyType(String familyType) {
        this.familyType = familyType;
    }

    public String getFamilyType() {
        return familyType;
    }
}
