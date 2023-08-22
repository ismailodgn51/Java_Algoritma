import javax.swing.*;

public class HelperArray {

          static int[] copy(int[] l1, int a){
              int[] copydizi = new int[a];

              if( a<=l1.length){

                  for (int i=0; i<a;i++){
                      copydizi[i]=l1[i];
                  }
              }
                  return copydizi;
          }

    static int[] copy(int[] l1, int aralik1,int aralik2){
        int[] copydizi = new int[3];
        int number=0;

        if( aralik1<=l1.length & aralik2<l1.length){

            for (int i=aralik1; i<aralik2;i++){
                copydizi[number]=l1[i];
                number++;
            }
        }
        return copydizi;
    }

    static boolean equals(int[] l1,int[] l2){

        if(l2.length!=l1.length){
            return false;
        }
        for (int i=0; i< l1.length;i++){
            if((l1[i]!=l2[i])){
                return false;
            }
        }
        return true;
    }

}
