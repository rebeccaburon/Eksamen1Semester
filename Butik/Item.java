package Butik;

public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String toString(){
        return "\nName: " + name + " " + "\nPrice: " + price + " DKK " + " ";
    }
}
