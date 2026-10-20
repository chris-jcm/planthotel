package model;

public class Carnivorous extends Plant {
    private static final float BASE_VOLUME = 0.1F;
    private static final float LENGTH_MULTIPLIER = 0.2F;

    public Carnivorous(String name, float length) {
        super(name, length, LiquidType.PROTEIN_DRINK);
    }

    // Polymorphism - implements its own version of the interface method
    @Override
    public float getLiquidVolume() {
        return BASE_VOLUME + (LENGTH_MULTIPLIER * getLength());
    }
}
