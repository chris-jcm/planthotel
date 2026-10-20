import data.PlantData;
import manager.PlantManager;
import ui.TerminalUI;

public class Main {
    public static void main(String[] args) {

        var data = new PlantData();
        var plants = data.getAllPlants();
        var plantManager = new PlantManager(plants);
        var app = new TerminalUI(plantManager);

        app.run();
    }
}

