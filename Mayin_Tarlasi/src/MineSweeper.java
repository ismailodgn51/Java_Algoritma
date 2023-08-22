import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner input = new Scanner(System.in);
    Random random=new Random();
    int Satrilength;
    int Sutunlength;
    int satir;
    int sutun;

    int MayinSayisi=0;
    String[][] Mdizi;
    String[][] Gdizi;


    MineSweeper(int Satrilength, int Sutunlength) {

        this.Satrilength = Satrilength;
        this.Sutunlength = Sutunlength;
        this.Mdizi=new String[Satrilength][Sutunlength];
        this.Gdizi=new String[Satrilength][Sutunlength];
        this.MayinSayisi=((Satrilength*Sutunlength)/4);

    }

    public void Dizi()

    {
        for (int i = 0; i < Mdizi.length; i++) {
            for (int j = 0; j < Mdizi[i].length; j++) {

                Mdizi[i][j] = "-";
                Gdizi[i][j] = "-";
            }

        }
    }

    public void MayinEkle(){
        for (int i=1; i<=MayinSayisi;i++){
            int randomSayi= random.nextInt(Satrilength);
            int randomSayi2= random.nextInt(Sutunlength);

            if (!(Mdizi[randomSayi][randomSayi2].equals("*"))){
                Mdizi[randomSayi][randomSayi2]="*";
            }else {
                i--;
            }
        }
        for (int i=0; i<Mdizi.length;i++){
            System.out.println(Arrays.toString(Mdizi[i]));
        }
    }

    public void GameMayinEkle(){
        System.out.println("Mayin Konumu");
        MayinEkle();
        System.out.println("--------------Oyuna Hoş Geldiniz---------------");
        for (int i=0;i< Gdizi.length;i++){
            for (int j=0; j<Gdizi[i].length;j++){
                if (Mdizi[i][j].equals("*")){
                    Gdizi[i][j]="-";
                }
            }
        }
        for (int i=0; i<Gdizi.length;i++){
            System.out.println(Arrays.toString(Gdizi[i]));
        }
    }

    public void control(){

        while(true){
            System.out.print("Satir Giriniz : ");
             satir = input.nextInt();
            System.out.print("Sutun Giriniz : ");
             sutun = input.nextInt();


            if(!((satir<0 || satir>=this.Satrilength)||(sutun<0 || sutun>=this.Sutunlength))){
                if(Mdizi[satir][sutun].equals("*")) {
                    System.out.println("game over");
                    break;
                }

                if (!(Mdizi[satir][sutun]=="-")){
                    System.out.println("Daha Önce Girilmiş Kordinant");
                    continue;

                }
                Mayinsayisi();
                if (finish()) {
                    System.out.println("Tebrikler kazandiniz :)))))");

                    System.out.println("Çözdüğünüz Genel Tablo Asaşıdaki Gibidir");

                    for (int i=0;i<Mdizi.length;i++){
                        System.out.println(Arrays.toString(Mdizi[i]));
                    }

                    break;
                }

            }else {
                System.out.println("HATALI ALAN");
                continue;
            }
        }


        while (true){
            System.out.println("Tekrar Oynamak İstemisiniz");
            System.out.println("1=Evet"+"    2=Hayir");
            int z=input.nextInt();

            switch (z){
                case 1:
                    run();
                    break;

                case 2:
                    System.out.println("Tekrak Görüşmek üzere Görüşürüüüüüüzz");
                    break;

                default:
                    System.out.println();
                    System.out.println("Hatali tuşlama yaptiniz");
                    System.out.println();
                    continue;
            }
            break;
        }
    }

   public void Mayinsayisi(){
        int sayac=0;
        for (int i =satir-1;i<=satir+1;i++){

            if (!(i<0||i>=Satrilength)){
                for (int j =sutun-1;j<=sutun+1;j++){
                    if (i==satir && j==sutun){
                        continue;
                    }
                    if (!(j<0 || j>=this.Sutunlength)){
                        System.out.println(i+" "+ j);
                        if(Mdizi[i][j].equals("*")){
                            sayac++;
                        }

                    }else {
                        continue;
                    }
                }
            }else {
                continue;
            }
        }
       Gdizi[satir][sutun]=String.valueOf(sayac);
       Mdizi[satir][sutun]=String.valueOf(sayac);

       for (int i=0; i<Gdizi.length;i++){
           System.out.println(Arrays.toString(Gdizi[i]));
       }

    }


    public boolean finish(){

        for (int i=0;i<Mdizi.length;i++){
            for (int j=0;j<Mdizi[i].length;j++){
                if (this.Mdizi[i][j].equals("-")){
                    return false;
                }
            }
        }


      /*  int sayac=0;
        for (int i=0;i<Gdizi.length;i++){
            for (int j=0;j<Gdizi[i].length;j++){
                if (this.Gdizi[i][j]=="-"){
                    sayac++;
                }
            }
        }
        if (this.MayinSayisi==sayac){
            return true;
        }
        sayac=0;*/
        return true;
    }
    void run() {

     Dizi();
     GameMayinEkle();
     control();

        }

    }



