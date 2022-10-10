package chapter2;
import java.util.*;

public class Latihan1No3{
    public static void main(final String[] args) {

      double foodDiscount = 0.15;
      double drinkDiscount = 0.10;
     HashMap<String,Double> delivery = new HashMap<String,Double>();
     delivery.put("food",(1 * 17000.0));
     delivery.put("food",(3 * 12000.0));
     delivery.put("drink",(3 * 5000.0));
     int totalDelivery = 0;
      for(Map.Entry item:delivery.entrySet()){
        String typeDelivery = (String) item.getKey();
        double price = (double) item.getValue();
        if(typeDelivery == "food"){
           totalDelivery += (price - (price*foodDiscount)); 
        } else {
            totalDelivery += (price - (price*drinkDiscount));
        }
      }
      System.out.println("total delivery = "+ totalDelivery);
    }
}