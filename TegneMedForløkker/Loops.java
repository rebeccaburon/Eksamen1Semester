package TegneMedForløkker;

public class Loops {

    public void drawLeftTriangle(int line){

        for (int i = 1; i <= line; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Så den skifter til en ny linje efter hver række.
            System.out.println();
        }

    }
    public void  drawRightTriangle(int line){
        for (int i = 1; i <= line; i++) {
            // flyt trekanten til højre
            for (int j = 1; j <= line - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Så den skifter til en ny linje efter hver række.
            System.out.println();
        }

    }
}
