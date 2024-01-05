package Stop_madspild;

import java.time.LocalDate;

public class CategoryInfo {
    private int code;
    private String name;
    private LocalDate saleByDate;


    public  CategoryInfo(int code, String name, LocalDate saleByDate){
        this.code = code;
        this.name = name;
        this.saleByDate = saleByDate;
    }
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }


    public LocalDate getSaleByDate() {
        return saleByDate;
    }
}
