package Køb_Blomster;

import java.util.ArrayList;

public class FlowerShop {
    private TextUI ui = new TextUI();

    private int total;
    private ArrayList<String> flowers = new ArrayList<>();

    public FlowerShop() {
        this.flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Tulip");
        flowers.add("Sunflower");
        flowers.add("Daisy");
        flowers.add("Lilly");
        flowers.add("Iris");
        flowers.add("Lavender");
        flowers.add("Anemone");
        flowers.add("Snapdragon");
        flowers.add("Bluebell");

        total = 0;
    }

    public void displayFlowerList() {
        System.out.println("Flowers List:");
        for (int i = 0; i < flowers.size(); i++) {
            System.out.println((i + 1) + ". " + flowers.get(i));
        }
    }

    public void runDialog() {
        ui.displayMsg("This is a list of the flowers in my shop");
        ui.displayMsg("");
        displayFlowerList();

        ui.displayMsg("Choose 3 flowers you would like to buy, THANKS!");

        ArrayList<String> chosenFlowers = new ArrayList<>();

        try{
        for (int i = 0; i < 3; i++) {
            int input = Integer.parseInt(ui.getInput("\nTo choose a flower, pick a number."));

            if (input >= 1 && input <= flowers.size()) {
                chosenFlowers.add(flowers.get(input - 1));
                updateTotalPrice(input);
            } else {
                i--; // Decrement i to allow the user to try again for the same flower slot.
            }
        } } catch (NumberFormatException e){
            ui.displayMsg("Try agin!");
            runDialog();
        }

        ui.displayMsg("You have chosen these 3 flowers: ");
        for (String flower : chosenFlowers) {
            System.out.println(flower);
        }

        String choice = ui.getInput("Would you like the flowers arranged into a bouquet? It costs 50DKK extra\nPress Y for 'Yes' and N for 'No.' ");

        do {
            choice = ui.getInput("Would you like the flowers arranged into a bouquet? It costs 50DKK extra\nPress Y for 'Yes' and N for 'No.' ");

            if (choice.equalsIgnoreCase("Y")) {
                total += 50;
                ui.displayMsg("\nThe total price is: " + total + "DKK.");
            } else if (choice.equalsIgnoreCase("N")) {
                ui.displayMsg("\nThe total price is: " + total + "DKK.");
            }

        } while (!choice.equalsIgnoreCase("Y") && !choice.equalsIgnoreCase("N")) ;

    }


    private void updateTotalPrice(int choice) {
        if (choice >= 1 && choice <= 4) {
            total += 20;
        } else if (choice >= 5 && choice <= 7) {
            total += 40;
        } else if (choice >= 8 && choice <= 10) {
            total += 80;
        }
    }
}
