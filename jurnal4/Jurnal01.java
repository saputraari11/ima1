import java.util.Scanner;

public class Jurnal01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();
        String isFactorOf24And56 = ((24%inputNumber == 0) && (56 % inputNumber == 0)) ? "Faktor dari 24 dan 56":"Bukan faktor dari 24 dan 56";
        System.out.println(isFactorOf24And56);
    }
}