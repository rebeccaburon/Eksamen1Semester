package Stop_madspild;
// LocalDate er en klasse der kan bruges til at arbejde med datoer
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
public class FoodWaste {
    // her tilføjer jeg grænse på de dets index nummer
private  List<Integer>limits = Arrays.asList(3, 1, 14, 2, 5);

// i parameterne tilføjer jeg int kategori og et data objekt af klassen LocalDate.
public boolean checkDate (int category, LocalDate saleByDate){
    // henter grænse numrene til kategorierne?
    int limit = limits.get(category);

    LocalDate stopfoodWasteDate = saleByDate.minusDays(limit);

    // tjekke om stopfoodWasteDate er før eller efter dags dato.

    return stopfoodWasteDate.isBefore(LocalDate.now()) || stopfoodWasteDate.isEqual(LocalDate.now());
}

}
