import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Kelime giriniz:");
            String a = input.next();
            String aa = "";

            for (int j = a.length() - 1; j >= 0; j--) {
                aa += a.charAt(j);
            }


            if (a.equals(aa)) {
                System.out.println("polindromik");
            } else {
                System.out.println("Polindromik değil");
            }

        }
    }

        }

