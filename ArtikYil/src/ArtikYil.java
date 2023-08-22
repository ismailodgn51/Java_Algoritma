import java.text.BreakIterator;
import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int yil;
        boolean sifir=true;
        System.out.print("Yil giirniz: ");
        yil=input.nextInt();

        if (yil%4==0){
            if (yil%100!=0){
                sifir=true;
            }else if (yil%400==0){
                sifir=true;
            } else {
                sifir=false;

            }
       }else {
            sifir = false;
        }
        if (sifir==false){
            System.out.print(yil+" bir artik yil değildir !");
        }else {
            System.out.print(yil+" bir artik yildir !");
        }

    }
}
