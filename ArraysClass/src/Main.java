import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list={1,2,3,6,8,-10,21};
        int[] list2={1,2,3,6,8,-10,21};
        int[] list3={1,2,3,6,8,-10,21,30};

       //küçükten büyüğe sıralama
       // Arrays.sort(list);

        //dizin elemanının hangi indiste sırada olduğunu buluyor önce sırala
      //  Arrays.sort(list);
      //  System.out.println(Arrays.toString(list));
     //   System.out.println(Arrays.binarySearch(list,8));


      //  array kopyalamak ilk dört elemanı yazar aynisini yaz for ile
      //  int[] copyarray=Arrays.copyOf(list,4);
      //  System.out.println(Arrays.toString(copyarray));

        //array kopyalamak istediğin aralikta bunuda yaz herperarreyde
      //  int[] copyarray2=Arrays.copyOfRange(list,2,5);
     //   System.out.println(Arrays.toString(copyarray2));


        //dizinin eşit olup olmadığını bulma eşitse true donderir FORLA YAp
        //System.out.println(Arrays.equals(list,list2));

        System.out.println(HelperArray.equals(list,list3));

    }
}