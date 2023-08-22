public class Main {
    public static void main(String[] args) {

        double[] list={15,1,2};
        double sum=0;
        double avarage=0.0;
        double harmonik=0;
        for(int i=0; i<list.length; i++){
            sum+=list[i];
        }
        avarage=sum/ list.length;
        System.out.println(avarage);


        for(double item:list){
            harmonik+=1/item;
        }

        System.out.println(harmonik);

    }


}