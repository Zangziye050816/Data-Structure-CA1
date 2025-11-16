import object.DisplayCase;
import object.JewelleryItem;
import object.DisplayTray;
import object.Material;

public class Main {
    public static void main(String[] args) {
        // Create a jewelry store
        JewelleryShop store = new JewelleryShop();

        // Create a showcase
        DisplayCase displayCase1 = new DisplayCase("A", "glass", true);
        DisplayCase displayCase2 = new DisplayCase("B", "steel", false);

        // Create two display trays
        DisplayTray tray1 = new DisplayTray("A1", "Red Velvet", 30, 20);
        DisplayTray tray2 = new DisplayTray("B2", "Blue Velvet", 25, 15);

        // Create some jewelry items
        JewelleryItem watch = new JewelleryItem("Diamond Ring", "Watch", "male", "", 5600.0);
        JewelleryItem necklace = new JewelleryItem("Gold Necklace", "Necklace", "Female", "", 148.0);

        //Create some material
        Material material1 = new Material("glod", "99.99%", 2, 11.11);

        //Add material to jewelry
        watch.addFirstMaterial(material1);

        // Add jewelry items to tray
        tray1.addFirstItem(watch);
        tray2.addLastItem(necklace);

        // Add trays to display cabinets
        displayCase1.addTray(tray1);
        displayCase2.addTray(tray2);

        // Add display cabinet to jewelry store
        store.addDisplayCase(displayCase1);

        // Print showcase information
        DisplayCase retrievedCase = store.getDisplayCase("A");
        if (retrievedCase != null) {
            retrievedCase.printCase();

        } else {
            System.out.println("Display case not found.");
        }
    }
}