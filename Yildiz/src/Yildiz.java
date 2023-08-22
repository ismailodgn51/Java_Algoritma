import java.util.Scanner;
public class Yildiz {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int a;
        System.out.print("bir sayi giriniz: ");
        a=input.nextInt();

        for (int i=1;i<=a;i++){
            for (int k=1;k<=a-i;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            //System.out.println("*");
        }
            System.out.println();
        }




    }


}
