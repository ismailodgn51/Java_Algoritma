public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;


    Match(Fighter f1,Fighter f2,int maxWeight,int minWeight){
        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }

    void run(){
        int i=1;
        if (ischeck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {


                System.out.println(i+".ci Rount");
                this.f2.health = this.f1.hit(f2);
                if(isWin()){
                    break;
                }

                this.f1.health = this.f2.hit(f1);
                if(isWin()){
                    break;
                }

                System.out.println(this.f1.name+" Saglik: "+ this.f1.health);
                System.out.println(this.f2.name+" Saglik: "+ this.f2.health);
                i++;

            }
        }else {
            System.out.println("siklet uğusmadi");
        }
    }


    boolean ischeck(){
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }

    boolean isWin(){
        if(this.f1.health ==0){
            System.out.println(this.f2.name+" Kazandı");
            return true;
        }
        if(this.f2.health ==0){
            System.out.println(this.f1.name+" Kazandı");
            return true;
        }
        return false;
    }

}
