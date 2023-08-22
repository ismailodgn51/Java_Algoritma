import java.util.Scanner;
public class AmstrongSayi {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int sayi,basamaksayisi=0,a,toplam=1,amstrong=0;
        System.out.println("Sayi giriniz ");
        sayi=input.nextInt();


        int kopyasayi=sayi;
      while (kopyasayi !=0) {

          basamaksayisi++;
          kopyasayi /= 10;

      }
        kopyasayi=sayi;
      while (kopyasayi !=0){
          a=kopyasayi%10;
          toplam=1;
          for (int i=1;i<=basamaksayisi;i++){
              toplam=toplam*a;
          }
          amstrong=amstrong+toplam;
          kopyasayi=kopyasayi/10;

          }

        System.out.println(amstrong);

      }


    }

