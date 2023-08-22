public class Main {
    public static void main(String[] args) {


        int b=2;

      int sayac=0,sayac2=1;
        boolean control=true;

              for (int i=2; sayac2<=50;i++){

                  for (int j=2;j<=i;j++){

                      if (i!=j){
                          if (i%j==0){
                              control =false;
                          }
                      }

                  }
                  if (control==true){
                      System.out.print(i +" ");
                      if (sayac2%10==0){
                          System.out.println(sayac2);
                      }
                      sayac2++;

                  }

                  control =true;


              }



      }

    }
