import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Random random=new Random();

        int a=random.nextInt(1000000);
        int b,c,d;
        System.out.println(a);

        int toplam=0;
        while (true){
            if (a<10){
                toplam=toplam+a;
                System.out.println("Sayiniz toplami= "+toplam);
                break;
            }
            b=a%10;
            c=(a-b)/10;
            a=c;
            toplam=toplam+b;
        }


    }
}