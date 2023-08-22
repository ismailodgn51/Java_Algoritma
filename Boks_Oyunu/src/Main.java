public class Main {
    public static void main(String[] args) {


        Fighter f1 = new Fighter("A",10,120,100,15);
        Fighter f2 = new Fighter("B",20,85,85,10);

        Match match=new Match(f1,f2,100,85);
        match.run();

        }

    }

