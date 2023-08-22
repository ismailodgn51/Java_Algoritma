public class fibonachi {

    public static void fib(int a) {

        int test=a;

        while (!(a < 0 || a == 0)) {
            System.out.print(" " + a);
            a -= 5;
     }

        for (int i=a;i<=test;i+=5){

            System.out.print(" "+a);
            a+=5;

        }


    }

    public static void main(String[] args) {
        fib(16);

    }
}
