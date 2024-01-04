package To_slags_spillere;

public class Main {
    public static void main(String[] args) {
        TextUI ui = new TextUI();
        HumanPlayer humanPlayer = new HumanPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();

        int randomValue = (int) (Math.random() * 10) + 1;


        int humanGuess = humanPlayer.makeAGuess(randomValue);


        int computerGuess = computerPlayer.makeAGuess(randomValue);


            ui.displayMsg("\nThe Lucky number is: " + randomValue);


            ui.displayMsg("\nThe human player guessed: " + humanGuess);

            if (humanGuess == randomValue) {

                ui.displayMsg("\nCongratulations!\nThe Human player guessed correctly!");
            } else {
                ui.displayMsg("\nShame...\nThe Human player guessed incorrectly.");
            }

            ui.displayMsg("\nAnd the Computer player guessed: " + computerGuess);

            if (computerGuess == randomValue) {
                ui.displayMsg("\nCongratulations!\nThe Computer player guessed correctly!");
            } else {
                ui.displayMsg("\nOh, even computers can be wrong.\nThe Computer player guessed incorrectly.");
            }





    }

}


