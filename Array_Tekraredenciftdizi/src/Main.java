import java.util.Arrays;
public class Main {
   static boolean kontrol1(int[]arr,int value) {

       for (int i : arr) {
           if (i == value)
           {
               System.out.println("girdi treu");

               return true;
           }

       }
       System.out.println("girdi false");
       return false;
   }
    public static void main(String[] args) {

        int dizi[]={1,3,3,2,4,4,2};
        int Kontrol[]=new int[dizi.length];
        int number =0;
        for (int i=0; i< dizi.length;i++){
            for (int j=0;j< dizi.length;j++){
                if ((i!=j) && (dizi[i]==dizi[j])){
                    if(dizi[i]%2==0){
                        if (!kontrol1(Kontrol,dizi[i]))
                        Kontrol[number++]=dizi[i];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(Kontrol));
    }
}