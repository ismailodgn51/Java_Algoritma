public class Main {
    public static void main(String[] args) {


        int[][] Matrix={{1,2,3},{4,5,6}};

        System.out.println("Matis :");
        for (int[] row:Matrix){
            for (int col:row){
                System.out.print(col+" ");
            }
            System.out.println("");
        }

        int[][] Transpoze=new int[Matrix[1].length][Matrix.length];
        System.out.println("Transpoze :");
        for (int i =0;i<Matrix.length;i++){
            for (int j=0; j<Matrix[i].length;j++){
                Transpoze[j][i]=Matrix[i][j];
            }
        }
        for (int[] row:Transpoze){
            for (int col:row){
                System.out.print(col+" ");
            }
            System.out.println("");
        }

    }
}