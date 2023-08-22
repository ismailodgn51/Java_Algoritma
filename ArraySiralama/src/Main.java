import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Dizi Boyutunu giriniz=");
        int DiziB=input.nextInt();
        int DiziE;
        int[] Dizi=new int[DiziB];
        int number=0;

        for (int i=1;i<=DiziB;i++){
             System.out.print(i+".ci Elemanı=");
              DiziE=input.nextInt();
              Dizi[number++]=DiziE;

        }

        Arrays.sort(Dizi);
        System.out.println(Arrays.toString(Dizi));
    }
    }
