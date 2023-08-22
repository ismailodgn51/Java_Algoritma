import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        while (true){
        for (int i = a; i >= 1; i--) {
            System.out.print(i);
            if (i == 1) {
                for (int j = 2; j <= a; j++) {
                    System.out.print(j);

                }
            }

        }
            System.out.println();
            a=a-1;if (a==0){
            break;
        }
        }

        }
    }
