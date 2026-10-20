package model;

public class Palm extends Plant {
    private static final float BASE_VOLUME = 0.5F;

    public Palm(String name, float length) {
        super(name, length, LiquidType.TAP_WATER);
    }

    // Polymorphism - implements its own version of the interface method
    @Override
    public float getLiquidVolume() {
        return BASE_VOLUME * getLength();
    }
}
