package model;

public abstract class Plant implements Waterable {
    // Encapsulation - private fields prevent direct access from other classes
    private final String name;
    private final float length;
    private final LiquidType liquidType;

    public Plant(String name, float length, LiquidType liquidType) {
        this.name = name;
        this.length = length;
        this.liquidType = liquidType;
    }

    // Encapsulation - provide controlled access to private fields
    public String getName() {
        return name;
    }

    public float getLength() {
        return length;
    }

    public LiquidType getLiquidType() {
        return liquidType;
    }
}
