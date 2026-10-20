package data;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class PlantData {

    public List<Plant> getAllPlants() {
        return createPlants();
    }

    // Polymorphism - plants hold different subclasses
    private List<Plant> createPlants() {
        List<Plant> plants = new ArrayList<>();
        plants.add(new Cactus("Igge", 0.2F));
        plants.add(new Palm("Laura", 5));
        plants.add(new Carnivorous("Meatloaf", 0.7F));
        plants.add(new Palm("Olof", 1));
        return plants;
    }
}
