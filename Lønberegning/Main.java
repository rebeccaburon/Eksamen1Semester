package Lønberegning;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new MonthlyEmployee(17.500));
        employees.add(new HourlyEmployee (37.5, 157.98));
        employees.add(new CommissionEmployee(15.200, 5, 29.3));

        for (Employee employee : employees){
            System.out.println("Salary: " + employee.calculateSalary() + " DKK");

        }

    }
}
