public class Main {
    public static void main(String[] args) {


        int [][] matris=new int[3][4];

        int number=1;
        for(int i=0;i< matris.length;i++){
          //  System.out.println();
            for (int j=0;j<matris[i].length;j++){
                matris[i][j]=number++;

               // System.out.print(matris[i][j]+" ");
            }
        }
        for (int i=0;i<matris.length;i++){

            for (int j=0;j< matris[i].length;j++){
                System.out.print(matris[i][j]+" ");
            }

        }

    }
}