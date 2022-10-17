import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalTransaction = input.nextDouble();
        double discount = totalTransaction > 200000 ? (0.1*totalTransaction) : 0;
        final double TOTAL = totalTransaction - discount;
        final double FEE = (0.11*TOTAL);
        final double TOTALPAYMENT = TOTAL + FEE ;
        System.out.println(String.format("Transaksi = %.0f\nTotal = %.0f\nPpn 11%% = %.1f\nTotal dibayar = %.1f", totalTransaction,TOTAL,FEE,TOTALPAYMENT));
    }
}
