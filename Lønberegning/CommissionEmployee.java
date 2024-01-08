package Lønberegning;

public class CommissionEmployee extends Employee{
    private double baseSalary;
    private double sale;
    private double commissionPercentage;

    public CommissionEmployee(double baseSalary, double sale, double commissionPercentage){
        this.baseSalary = baseSalary;
        this.sale = sale;
        this.commissionPercentage = commissionPercentage;

    }
    @Override
    public double calculateSalary() {
        //Lønberegning er grundløn plus provision af medarbejderens salg.
        return baseSalary + (sale * commissionPercentage / 100);

    }

    public double getBaseSalary(){
        return baseSalary;
    }
    public double getSale(){
        return sale;
    }
    public double getCommissionPercentage(){
        return commissionPercentage;
    }
}
