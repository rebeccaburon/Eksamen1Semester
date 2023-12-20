package Interaktiv.quiz;
import java.util.ArrayList;
import java.util.Arrays;
public class QuizElement {
    private String question;
    private String correctAnswer;
    private ArrayList<String> wrongAnswers;


    public QuizElement(String question, String correctAnswer, ArrayList<String> wrongAnswers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.wrongAnswers = wrongAnswers;

    }


    public boolean isCorrect(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
    // Jeg endte ikke med at bruge denne methode.


    public String getQuestion() {
        return question;
    }


    public String getCorrectAnswer() {
        return correctAnswer;
    }


    public ArrayList<String> getWrongAnswers() {
        return wrongAnswers;
    }


}
