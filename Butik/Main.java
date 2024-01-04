package Butik;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Agurk ", 10.95);


        OrderLine orderLine1 = new OrderLine(item1, 5);
        System.out.println(orderLine1);
    }
}

