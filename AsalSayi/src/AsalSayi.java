public class AsalSayi {
    public static void main(String[] args) {

        int asallik;

        for (int i=2;i<=100;i++){
            int kontorl =0;
            for (int k=2; k<=(i/2);k++){

                if (i%k==0){
                    kontorl=1;

                }

            }

            if (kontorl==0){
                System.out.println(i);
            }

        }
    }
}
