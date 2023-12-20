package Interaktiv.quiz;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Quiz q = new Quiz();
        //Spørsmpål 1
        q.addQuizElement("\nWhat is the capital of France?", "Paris", new ArrayList<>(Arrays.asList("Berlin", "Amserdam")));
        //Spørsmpål 2
        q.addQuizElement(" \nWhich planet is known as the Red Planet", " Mars", new ArrayList<>(Arrays.asList("Jupiter", "Venus")));
        //Spørsmpål 3
        q.addQuizElement("\nWho wrote the play Romeo and Juliet", " William Shakespeare", new ArrayList<>(Arrays.asList("Jane Austen", "Charles Dickens")));
        //Spørsmpål 4
        q.addQuizElement("\nWhat is the main ingredient in guacamole?", " Avocado", new ArrayList<>(Arrays.asList("Tomatoes", "Onions")));
        //Spørsmpål 5
        q.addQuizElement("\nWhich programming language is often used for web development?", " HTML/CSS", new ArrayList<>(Arrays.asList("Jave", "Python")));

        q.playGame();

    }
}
