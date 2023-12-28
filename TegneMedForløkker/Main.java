package TegneMedForløkker;

public class Main {
    public static void main(String[] args) {
        TextUI ui = new TextUI();
        Loops loops = new Loops();

        ui.displayMsg("Let's draw a Triangle! ");
        String input = ui.getInput("\nType 'L' for left triangle or 'R' for right triangle: ");
        String lineInput;
        //while (!input.equalsIgnoreCase("L") && !input.equalsIgnoreCase("R")) {
            if (input.equalsIgnoreCase("L")) {
                lineInput= ui.getInput("\nPerfect, how many lines should the triangle have?");
                loops.drawLeftTriangle(Integer.parseInt(lineInput));

            } else if (input.equalsIgnoreCase("R")) {
                lineInput= ui.getInput("\nPerfect, how many lines should the triangle have?");
                loops.drawRightTriangle(Integer.parseInt(lineInput));
            } else {
                // få denne til at virke ordenligt!!
                System.out.println("\nInvalid input. Please try again! ");

            }

        }
    }

