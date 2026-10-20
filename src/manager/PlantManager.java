package manager;

import model.Plant;
import java.util.List;

public class PlantManager implements PlantProvider {
    private final List<Plant> plants;

    public PlantManager(List<Plant> plants) {
        // Create its own unmodifiable copy of plants
        this.plants = List.copyOf(plants);
    }

    public Plant getPlantByName(String name) {
        for (var plant : plants) {
            if (plant.getName().equalsIgnoreCase(name)) {
                return plant;
            }
        }
        return null;
    }

    public List<Plant> getAllPlants() {
        return plants;
    }
}
