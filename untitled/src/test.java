import javax.swing.*;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c,kalan;
        String deger = null;
        System.out.print( "yıl gir:");
        c=input.nextInt();


        kalan=c%12;
        switch (kalan){
            case 0:
                deger="maymun";
                break;
                

                
                
            default:
                System.out.println("hata");
        }
        System.out.println("çin degeri "+deger);

    }
}
