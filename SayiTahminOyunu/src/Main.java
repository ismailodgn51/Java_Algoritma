import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand=new Random();
        int number= rand.nextInt(100);
      // double number =((int) (Math.random()*100));

        Scanner input=new Scanner(System.in);
        int rigth=0;
        int selected;
        int [] wrong=new int[5];
        boolean isWin =false;
        boolean isWrong =false;

        while (rigth<3){
            System.out.println(number);
            System.out.print("3 hakkiniz var lütfen tahiminizi giriniz : ");
            selected=input.nextInt();

            if(selected<0 || selected>99){
                System.out.println("lütfen 0 99 arası sayi girin");
                if (isWrong){
                    rigth++;
                    System.out.println("fazla hatali giriş kalan hakkınız: "+(5-rigth));

                }else{
                    System.out.println("bir daha hatali giriş yaparsaniz hakkiniz düşecek");
                    isWrong=true;
                }
                continue;
            }

            if(selected==number){
                System.out.println("tebrikler doğru tahmin tahmin ettiğiniz sayi="+number);
                isWin=true;
                break;
            }else{
                rigth++;
                System.out.print("hatali sayi girdiniz ");
                if ((3-rigth)==0){
                    break;
                }
                if(selected<number){
                    System.out.println("size bir ipucu daha büyük bir sayi girin! ");

                }else{
                    System.out.println("size bir ipucu daha küçük sayi girin! ");
                }
                wrong[rigth]=selected;
                System.out.println("kalan hakkiniz : "+(3-rigth));
                if ((3-rigth)==1){
                    System.out.println("Son hakkiniz Ona göre tahmin edin");
                }
            }

        }
        if (!isWin){
            System.out.println(Arrays.toString(wrong));
            System.out.println("kaybettin doğrusu "+number+" di");
        }
        }
    }
