package Interaktiv.quiz;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

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

        ArrayList<String> option = new ArrayList<>(Arrays.asList("A) " + quizElement.getWrongAnswers().get(0), "\n B) " + quizElement.getCorrectAnswer(), "\nC) " + quizElement.getWrongAnswers().get(1)));

        for (String answerOption : option) {
            ui.displayMsg(answerOption);
        }
        String input = ui.getInput("Enter either A, B or C. ");

        if (input.equalsIgnoreCase("B")) {
            ui.displayMsg("\n Correct answer! " + quizElement.getCorrectAnswer());
        } else {
            ui.displayMsg("Wrong! The correct answer is: " + quizElement.getCorrectAnswer());
        }

            return "";
    }
        public void playGame() {
            for (QuizElement quizElement : quizElements) {
                askQuestion(quizElement);
            }
        }
    }





