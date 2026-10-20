package model;

public enum LiquidType {
    TAP_WATER("Kranvatten"),
    MINERAL_WATER("Mineralvatten"),
    PROTEIN_DRINK("Proteindryck");

    private final String displayName;

    LiquidType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
