import java.util.Scanner;

public class Jurnal03 {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

        int dira = input.nextInt();
        int radi = input.nextInt();
        int idar = input.nextInt();

        if(dira > radi && dira > idar){
            if (radi >idar) {
                System.out.println(String.format("%s %s %s", "Idar","Radi","Dira"));
            } else {
                System.out.println(String.format("%s %s %s", "Radi","Idar","Dira"));
            }
        } else if (radi > dira && radi > idar) {
            if (dira>idar) {
                System.out.println(String.format("%s %s %s", "Idar","Dira","Radi"));
            } else {
                System.out.println(String.format("%s %s %s", "Dira","Idar","Radi"));
            }
        } else if(idar > radi && idar>dira) {
            if (dira>radi) {
                System.out.println(String.format("%s %s %s", "Radi","Dira","Idar"));
            } else {
                System.out.println(String.format("%s %s %s", "Dira","Radi","Idar"));
            }
        } 
   } 
}
