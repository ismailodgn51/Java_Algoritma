import java.util.Scanner;
public class Desen {

    static void Metod(int n){
        if(n>0) {
            System.out.print(" "+n);
            Metod(n - 5);

        }

        System.out.print(" "+n);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("N Sayisi : ");
        int n =input.nextInt();
        Metod(n);
    }
}
