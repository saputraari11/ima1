import java.util.*;

public class TP3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String,Integer> studentScore = new HashMap<String,Integer>();      
        studentScore.put("Dira", input.nextInt() );
        studentScore.put("Radi", input.nextInt());
        studentScore.put("Idar", input.nextInt());
        String maxScore = "";
        int score = 0;
        for(Map.Entry item:studentScore.entrySet()){
            if(score <= (int) item.getValue()) {
                score = (int) item.getValue();
                maxScore = (String) item.getKey();
            }
        }
        System.out.println(maxScore);
    }
}
