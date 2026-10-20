package manager;

import model.Plant;

import java.util.List;

public interface PlantProvider {
    Plant getPlantByName(String name);
    List<Plant> getAllPlants();
}
