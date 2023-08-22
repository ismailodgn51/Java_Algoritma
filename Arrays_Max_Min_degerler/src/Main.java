import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int[] list ={15,12,700,1,-1,-778,2,0};
        int min=list[5];
        int max=list[1];
        for (int item : list){
            if(item<min){
                min=item;
            }
            if(item>max){
                max=item;
            }
        }

        System.out.println(min);
        System.out.println(max);
        System.out.println("-----------------");

        int sayi=input.nextInt();

        Arrays.sort(list);
        int sayidanbüyükenyakin=list[3];
        int sayidankücükenyakin=list[2];
        for (int item : list) {
          if(item>sayi){
              sayidanbüyükenyakin=item;
              break;
            }
          
        }
        for (int i= list.length-1;i>=0;i--){
            if(list[i]<sayi){
                sayidankücükenyakin=list[i];
                break;
            }
        }
        System.out.println(sayidanbüyükenyakin+""+sayidankücükenyakin);
    }
}