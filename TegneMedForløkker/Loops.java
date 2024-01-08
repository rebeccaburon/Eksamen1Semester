package TegneMedForløkker;

public class Loops {

    public void drawLeftTriangle(int line) {
// antallet af rækker i trekanten
        for (int i = 1; i <= line; i++) {
            //antallet af stjerner i den bestemte række
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            // Så den skifter til en ny linje efter hver række.
            System.out.println();
        }

    }

    public void drawRightTriangle(int line) {
        //antallet af rækker i trekanten
        for (int i = 1; i <= line; i++) {
            // antallet af mellemrum til venstre for stjernerne - flytte trækanten tilhøjre
            //Antallet af mellemrum afhænger af værdien af line - i
            for (int j = 1; j <= line - i; j++) {
                System.out.print(" ");
            }
            //antallet af stjerner i den aktuelle række
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Så den skifter til en ny linje efter hver række.
            System.out.println();
        }

    }
}
