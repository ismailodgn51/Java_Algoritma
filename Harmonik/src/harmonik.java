import java.util.Scanner;
public class harmonik {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double sayi,toplam=0;
        System.out.print("sayi giriniz ");
        sayi =input.nextInt();

        for (double i=1;i<=sayi;i++){

           toplam=toplam+(1/i);



        }
        System.out.println(toplam);


    }




}
