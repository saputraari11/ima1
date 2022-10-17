import java.util.*;

public class TP3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if((a>b) && (a>c)) {
            System.out.println("Dira");
        } else if((b>a) && (b>c)) {
            System.out.println("Radi");
        } else {
            System.out.println("Idar");
        }
    }
}
