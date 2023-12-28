package Lønberegning;

public class HourlyEmployee extends Employee{
    private double numberOfHours;
    private double payPerHour;

    public HourlyEmployee(double numberOfHours, double payPerHour){
        this.numberOfHours = numberOfHours;
        this. payPerHour = payPerHour;
    }

    @Override
    public double calculateSalary() {
        return numberOfHours * payPerHour;

    }
    public double getNumberOfHours(){
        return getNumberOfHours();
    }
    public double getPayPerHour (){
        return getPayPerHour();
    }
}
