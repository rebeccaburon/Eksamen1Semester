package Stop_madspild;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FoodWaste f = new FoodWaste();

        // jeg valgte og tilføje et nogle categorier  til programmet, for at få en bedre forståelse

        CategoryInfo[] categories = {
                new CategoryInfo(0, "Frisk Frugt & Grønt", LocalDate.of(2024, 1, 5)),
                new CategoryInfo(1, "Fersk Kød", LocalDate.of(2024, 1, 8)),
                new CategoryInfo(2, "Konserves", LocalDate.of(2024, 1, 22)),
                new CategoryInfo(3, "Mejeriprodukter", LocalDate.of(2024, 1, 3)),
                new CategoryInfo(4, "Mel og Gryn", LocalDate.of(2024, 1, 10))
        };

        // Test hver kategori og udskriv resultatet
        for (CategoryInfo category : categories) {
            boolean result = f.checkDate(category.getCode(), category.getSaleByDate());
            System.out.println("\nNavnet på varen: " + category.getName() + "\nSkal varen i 'Stop Madspild kassen'? " + result);
        }


    }
}
