import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();
        String isFactorOf6 = inputNumber % 6 == 0 ? "Kelipatan Enam":"Bukan kelipatan enam";
        System.out.println(isFactorOf6);
    }
}