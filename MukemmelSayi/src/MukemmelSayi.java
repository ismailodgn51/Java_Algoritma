import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("bir sayi giriniz:");
        int a,top=0;
        a=input.nextInt();

       for (int i=1 ;i<a; i++){

           if (a%i==0){
               top+=i;

           }

       }
        System.out.println(top);
    }


}
