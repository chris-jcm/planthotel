package ui;

import manager.PlantProvider;
import model.Plant;
import java.util.Scanner;

public class TerminalUI {
    private static final String QUIT_COMMAND = "Q";
    private static final String TITLE = "Greenest | '" + QUIT_COMMAND + "' för att avsluta.";
    private static final String PROMPT = "Vilken växt ska få vätska?";
    private static final String PLANT_NOT_FOUND = "Ingen växt med det namnet.";
    private static final String LIQUID_VOLUME_FORMAT = "%.2f liter %s\n";

    private final PlantProvider plantProvider;
    // Decoupling - depends on the interface instead of the class
    public TerminalUI(PlantProvider plantProvider){
        this.plantProvider = plantProvider;
    }

    public void run() {
        var scanner = new Scanner(System.in);

        System.out.println(TITLE);

        while (true) {
            System.out.println(PROMPT);

            var input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase(QUIT_COMMAND)) {
                break;
            }

            var plant = plantProvider.getPlantByName(input);

            if (plant == null) {
                System.out.println(PLANT_NOT_FOUND);
            } else {
                showPlantInfo(plant);
            }
        }

        scanner.close();
    }

    private void showPlantInfo(Plant plant) {
        var plantName = plant.getName();
        var liquidVolume = String.format(
                LIQUID_VOLUME_FORMAT,
                plant.getLiquidVolume(),
                plant.getLiquidType().getDisplayName().toLowerCase());

        System.out.println(plantName);
        System.out.println(liquidVolume);
    }
}
