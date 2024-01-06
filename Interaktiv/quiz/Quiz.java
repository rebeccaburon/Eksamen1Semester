package Interaktiv.quiz;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Quiz {
    private ArrayList<QuizElement> quizElements = new ArrayList<>();
    public TextUI ui = new TextUI();

    public Quiz() {

    }

    public void addQuizElement(String question, String correctAnswer, ArrayList<String> wrongAnswers) {

        if (quizElements.size() <= 5) {
            QuizElement quizElement = new QuizElement(question, correctAnswer, wrongAnswers);
            quizElements.add(quizElement);
        }
    }

    public String askQuestion(QuizElement quizElement) {

        ui.displayMsg(quizElement.getQuestion());

        ArrayList<String> options = new ArrayList<>(Arrays.asList("A) " + quizElement.getWrongAnswers().get(0), "B) " + quizElement.getCorrectAnswer(), "C) " + quizElement.getWrongAnswers().get(1)));

        for (String quizElements: options){
            System.out.println(quizElements);
        }
        String input = ui.getInput("Enter either A, B or C. ");

        if (!input.equalsIgnoreCase("B")){
            ui.displayMsg("\nWrong! The correct answer is " + quizElement.getCorrectAnswer());
        } else {
            ui.displayMsg("\nCongratulations, it's the correct answer! " + quizElement.getCorrectAnswer());
        }


        return "";
    }
       /*


        //Udfordringen er at nu er det ikke i alfabetisk rækkefølge når og den spyder A, B og C. - Det var for ikke altid og have B som correct svar.

        //Shufler med de muligheder der er
        Collections.shuffle(options);

        // (char) er for at konvertere den numeriske værdi til en character
        for (int i = 0; i < options.size(); i++) {

            //  at selvom det rigtige svar ikke er i 'B'-positionen, vises etiketten, der er knyttet til det rigtige svar, korrekt.
            ui.displayMsg((char) ('A' + i) + ") " + options.get(i));
        }

        String input = ui.getInput("Enter either A, B or C. ");

        //check om svaret er korrekt
        if (input.equalsIgnoreCase((quizElement.getCorrectAnswer()))){

            ui.displayMsg("\nCongratulations, it's the correct answer! " + quizElement.getCorrectAnswer());
        } else {
            ui.displayMsg("\nWrong! The correct answer is " + quizElement.getCorrectAnswer());
        }
        return "";
    }
    */



        public void playGame() {
            for (QuizElement quizElement : quizElements) {
                askQuestion(quizElement);
            }
        }
    }





