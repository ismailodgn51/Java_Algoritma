// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


   public static int[] reverse(int[] list){
        int [] reverses = new int[list.length];
        for (int i=0,j= list.length-1; i< list.length;i++,j--){
            reverses[i]=list[j];
        }
        return reverses;
    }

    static void printArray(int[] list){
       for (int i=0;i< list.length;i++){
           System.out.println(list[i]);
       }
    }

    public static void main(String[] args) {

        int [] list={10,20,30,40,50,60,70,80,90,100};

        int[] newListe=reverse(list);

        printArray(newListe);
        }
    }
