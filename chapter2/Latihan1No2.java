package chapter2;
import java.util.*;

public class Latihan1No2{
    public static void main(final String[] args) {

      HashMap<Integer,Integer> passenger = new HashMap<Integer,Integer>();
      passenger.put(1, 3);
      passenger.put(2,4);
      passenger.put(3, 1);
      passenger.put(4,1);
      passenger.put(5, 5);
      passenger.put(6, 4);
      passenger.put(7, 3);
      int totalPassenger = 0;
      for(Map.Entry item:passenger.entrySet()){
        System.out.println("Penumpang shelter-"+item.getKey()+"= "+item.getValue());
        totalPassenger += (int) item.getValue();
      }
      System.out.println("total Passenger = "+ totalPassenger);
    }
}