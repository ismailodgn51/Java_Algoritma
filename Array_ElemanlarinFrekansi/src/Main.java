import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {



    static boolean kontorl(int[] arr,int value){

        for(int i:arr){
            if(i==value){
                return true;
            }
        }

        return false;

    }
    public static void main(String[] args) {

        int[] Array={20,10,20,10,7};
        int[] deplacite=new int[Array.length];
        System.out.println("TEKRAR SAYILARI");
        int numner=0;

        for (int i=0; i<Array.length;i++){
            int sayac=0;

            for (int j=0;j< Array.length;j++){
                if (Array[i]==Array[j]){
                    sayac++;
                }
            }
            if (!kontorl(deplacite,Array[i])){
                deplacite[numner++]=Array[i];
                System.out.println(Arrays.toString(deplacite));
                System.out.println(Array[i]+" Sayisi "+sayac+" Kere tekrar edildi.");

            }
           // System.out.println(Arrays.toString(deplacite));


        }



    }
}