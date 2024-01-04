package To_slags_spillere;

public class HumanPlayer implements Player {
    TextUI ui = new TextUI();
    private final int maxValue = 10;

    @Override
    public int makeAGuess(int value) {

            while (true) {
                try {
                    int input = Integer.parseInt(ui.getInput("\nType a number between 1 - " + maxValue + " :"));

                    if (input >= 1 && input <= maxValue) {
                        return input; // Hvis gyldigt, returner input og afslut løkken
                    } else {
                        ui.displayMsg("\nWrong number. ");
                    }
                } catch (NumberFormatException e) {
                    ui.displayMsg("\nPlease enter a valid number!");
                }
            }
        }

        public int getMaxValue(){
        return maxValue;
        }

    }

