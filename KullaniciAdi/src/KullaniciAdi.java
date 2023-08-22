import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class KullaniciAdi {
    public static void main(String[] args) {


        int a ,fak=1;
        Scanner input = new Scanner(System.in);
        System.out.print("sayigiriniz");
        a=input.nextInt();
            for (int i=a;i>=1;i--){

                fak=fak*i;

            }
        System.out.println(fak);



    }
}
