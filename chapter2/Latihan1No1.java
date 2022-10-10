package chapter2;
import java.util.*;

public class Latihan1No1{
    public static void main(final String[] args) {
      int saldoDira = 500000; // karena dira membuka rekening sebesar 500k
      saldoDira += 2000000; // dira mendapatkan gajihnya sebesar 2 juta

      HashMap<Integer,Integer> tagihanDira = new HashMap<Integer,Integer>();
      tagihanDira.put(1, 150000);
      tagihanDira.put(2,58000);
      tagihanDira.put(3, 192000);
      tagihanDira.put(4,120000);
      tagihanDira.put(5, 50000);
      int totalTagihanDira = 0;
      for(Map.Entry item:tagihanDira.entrySet()){
        System.out.println("tagihan dira hari-"+item.getKey()+"= "+item.getValue());
        totalTagihanDira += (int) item.getValue();
      }
      System.out.println("Total Tagihan dira:"+totalTagihanDira);
      System.out.println("Total Tabungan dira = "+(saldoDira-totalTagihanDira));
    }
}