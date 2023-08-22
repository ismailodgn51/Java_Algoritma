public class Student {

    Course c1;
    Course c2;
    Course c3;
    String name;
    String Stno;
    String Clases;
    double avarage;
    boolean ispass;

    Student(String name,String Stno,String Clases, Course c1, Course c2,Course c3){
        this.name=name;
        this.Stno=Stno;
        this.Clases=Clases;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.ispass=false;

    }


    void ogrencinotekle(int note1,int note2,int note3){
        if (note1>=0 && note1<=100) this.c1.note = note1;
        if (note2>=0 && note2<=100) this.c2.note = note2;
        if (note3>=0 && note3<=100) this.c3.note = note3;
    }

    void isPAss(){
        this.avarage=(this.c1.note+this.c2.note+this.c3.note)/3.0;
        if (this.avarage>=50){
            System.out.println("hababam sınıfı uyanıyor");
            this.ispass=true;
        }else {
            System.out.println("kaldı");
            this.ispass=false;
        }

        print();
    }


    void print(){
        System.out.println(this.c1.name+" notu/="+this.c1.note );
        System.out.println(this.c1.name+" notu/="+this.c2.note );
        System.out.println(this.c1.name+" notu/="+this.c3.note );
        System.out.println("Ortalamanız="+this.avarage);
    }
}
