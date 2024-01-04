package Butik;

public class OrderLine {
    private Item item;
    private int amount;

    public OrderLine ( Item item, int amount){
        this.item=item;
        this.amount=amount;
    }

    public double getTotalPrice(){

        return item.getPrice() * amount;
    }
    public String toString(){
        return "This is the Items you have in your order line: " + item.toString() + "\nThe amount of items is: " + amount + "\nTotal price is: " + getTotalPrice() + " DKK ";
    }

    }

