import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        boolean a =true;
        Scanner input = new Scanner(System.in);
        int sayi;

        while (a){
            System.out.print("sayi giririniz=");
            sayi=input.nextInt();

            if(sayi>5){
                continue;
            }

            if(sayi<5){
                break;
            }
            System.out.println("dsadsa");
        }

    }
}