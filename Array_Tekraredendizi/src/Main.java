import jdk.dynalink.beans.StaticClass;

import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i:arr){
            if(i==value){
                return true;
            }

        }
        System.out.println("girdi");
        return false;
    }
    public static void main(String[] args) {

        int[] list = {7,3,3};
        int[] dublicate=new int[list.length];

      int  number=0;
        int  number2=0;
        for (int i=0;i< list.length;i++){
            for(int j =0; j<list.length;j++){
                if ((i!=j) && (list[i]==list[j])){
                    System.out.print(i+" "+j+Arrays.toString(dublicate));
                    System.out.println("zzzzzzzzzzzzzzz");
                    if (!isFind(dublicate,list[j])){

                        dublicate[number++]=list[j];
                    }
                    break;

                }
            }
        }
        for (int value:dublicate){
            if(value!=0){
                System.out.println(value);

            }
        }


    }
}