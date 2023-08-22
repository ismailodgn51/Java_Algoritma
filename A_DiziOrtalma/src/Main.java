import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random=new Random();
        int[] dizi=new int[100];

        for (int i=0;i< dizi.length;i++){
            dizi[i]=random.nextInt(100);
        }


        /*böylede çağrılır fonksiyon
        double ort =ortalma(dizi);
        System.out.println(ort);*/

        //aşağıdaki gibide
        System.out.println(ortalma(dizi));
        }

      public static double ortalma(int[] dizi){

        double top=0,ortalamas=0;
        for (int i=0;i< dizi.length;i++){
            top=top+dizi[i];
        }
        ortalamas=(top/ dizi.length);

        return ortalamas;

        }
    }
