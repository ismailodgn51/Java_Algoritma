public class PoligromSayi {


    static int poli(int number){
        int testnumber=number,number1,number2=0;


        while (testnumber!=0){

            number1=testnumber %10;

            number2=(number2*10)+number1;

            testnumber=testnumber/10;

        }


        return number2;


    }



    public static void main(String[] args) {
        System.out.println(poli(256));



    }
}
