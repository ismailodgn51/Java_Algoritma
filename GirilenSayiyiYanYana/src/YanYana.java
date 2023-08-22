
import java.util.Scanner;
public class YanYana {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);


        while (true) {
            int a, b, sayi;
            System.out.println("iki rakam giriniz");

            a = input.nextInt();
            b = input.nextInt();

            sayi = (a * 10) + b;
            sayi = sayi + 10;
            System.out.println("sayi nin 10 fazlasi " + sayi);
        }





        }
    }
