package Butik;

import java.util.ArrayList;

public class Order {
   private ArrayList<OrderLine> orderLines = new ArrayList<>();

   public Order (){
   }

    public double getTotalPrice(){
        double totalPrice = 0;

        for (OrderLine orderLine : orderLines) {
            totalPrice += orderLine.getTotalPrice();
        }
        return totalPrice;
    }

    public void addOrderLine(OrderLine orderLine) {
        orderLines.add(orderLine);
    }

    public String toString (){
       StringBuilder stringBuilder = new StringBuilder("Orders : ");
        for (OrderLine orderLine : orderLines) {
            // kan tilføj tekst til StringBuilder = append
            stringBuilder.append(orderLine).append(" , ");
            // man kan bruge inset hvis man vil ændre i noget der står på et bestemt index nr.
        }
        stringBuilder.append("\nTotalPrice: " ).append(getTotalPrice());

        return stringBuilder.toString();
    }
}


