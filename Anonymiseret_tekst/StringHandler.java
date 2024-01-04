package Anonymiseret_tekst;
import java.util.List;

public class StringHandler {
    public static String replaceText(String inputText, List<String> studentNames, boolean isTeacher) {
        if (isTeacher) {
            return inputText; // Return the original text with names for teachers
        }

        for (String name : studentNames) {
            inputText = inputText.replaceAll(name, "den studerende");
        }
        return inputText;
    }
}
