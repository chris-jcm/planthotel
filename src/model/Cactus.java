package model;

public class Cactus extends Plant {
    private static final float BASE_VOLUME = 0.02F;

    public Cactus(String name, float length) {
        super(name, length, LiquidType.MINERAL_WATER);
    }

    // Polymorphism - implements its own version of the interface method
    @Override
    public float getLiquidVolume() {
        return BASE_VOLUME;
    }
}
