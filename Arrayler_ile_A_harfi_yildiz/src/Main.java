// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[][] A=new String[5][4];

        for (int i=0;i<A.length;i++){
            for (int j=0;j< A[i].length;j++ )
            if(i==0 || i==2 || i==4){
                A[i][j]=" * ";
            } else if(j==0 || j==3){
                A[i][j]=" * ";
            }else{
                A[i][j]="   ";
            }
        }

        for (String[] row : A){
            for (String col : row){

                System.out.print(col);
            }
            System.out.println();
        }
    }
}