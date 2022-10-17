import java.util.Scanner;

public class Angka3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a > b && a > c){
            if (b >c) {
                System.out.println(String.format("%d %d %d", c,b,a));
            } else {
                System.out.println(String.format("%d %d %d", b,c,a));
            }
        } else if (b > a && b > c) {
            if (a>c) {
                System.out.println(String.format("%d %d %d", c,a,b));
            } else {
                System.out.println(String.format("%d %d %d", a,c,b));
            }
        } else if(c > b && c>a) {
            if (a>b) {
                System.out.println(String.format("%d %d %d", b,a,c));
            } else {
                System.out.println(String.format("%d %d %d", a,b,c));
            }
        } 
    }
}