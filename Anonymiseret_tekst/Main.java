package Anonymiseret_tekst;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {


        String inputText = "Katrine trak sit spørgsmål kl. 10. Her fik Katrine  karakteren 7.\nAnders trak sit spørgsmål kl. 11. Her fik Anders karakteren 4";

        // Use ArrayList to store student names
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Anders");
        studentNames.add("Katrine");
        studentNames.add("Joakim");

        boolean isTeacherView = true; //skift til false hvis der skal stå den studerende

        String anonymizedText = StringHandler.replaceText(inputText, studentNames, isTeacherView);
        System.out.println(anonymizedText);
        }


    }




