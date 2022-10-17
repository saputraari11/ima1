import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double  bruto = input.nextInt();
        double fee = 0;
        if(bruto>500) {
            fee = 30;
        } else if(bruto>=251 && bruto<=500) {
            fee = 25;
        } else if(bruto>=51 && bruto<=250) {
            fee = 15;
        } else {
            fee = 5;
        }
        int million = 1000000;
        double feeInMillion = ((bruto*million) * (fee/100));
        double netto = ((bruto*million) - feeInMillion);
        System.out.println(String.format("Penghasilan kotor = %.0f juta Rupiah\nPajak %.0f%% = Rp. %.0f\nPenghasilan bersih = Rp. %.0f", bruto, fee,feeInMillion,netto));

    }
}
