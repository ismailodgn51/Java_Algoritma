import java.util.Scanner;
public class ussualma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int us, sayi, toplam = 1;
        System.out.print("üssü alinacak sayi: ");
        sayi = input.nextInt();

        System.out.print("üs olan sayi: ");
        us = input.nextInt();


        while (us >= 1) {
            toplam=toplam*sayi;

            us--;
        }
        System.out.println(toplam);
    }

}
