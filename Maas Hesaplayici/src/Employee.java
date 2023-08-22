import javax.sound.midi.Soundbank;

public class Employee
{
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name,double salary,int workHours ,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax(){
        double vergi;
        if(this.salary>1000){
            vergi=this.salary*0.03;

            return vergi;

        }else {
            return 0;
        }
    }
   int bonus(){
        int fark;
        if(this.workHours>40){
            fark=this.workHours-40;
            fark*=30;
            return fark;
        }else {
            return 0;
        }

    }

    double raiseSalary(){
        double zam;
        int Fark=20;
        if(Fark<10){
            zam=this.salary*0.05;
            return zam;
        } else if (Fark>9 && Fark<20) {
            zam=this.salary*0.10;
            return zam;
        } else if (Fark>19) {
            zam=this.salary*0.15;
            return zam;
        }else{
            return 0;
        }
    }

     void Yaz(){
         System.out.println("Adi:"+this.name);
         System.out.println("Maasi:"+ this.salary);
         System.out.println("Çalisma Saati:"+this.workHours);
         System.out.println("Başlangi. Yili:"+ this.hireYear);
         System.out.println("Vergi "+tax());
         System.out.println("Bonus:"+ bonus());
         System.out.println("Maas Artisi:"+ raiseSalary());
         System.out.println("Vergi ve bonuslarla birlikte maaş"+ (this.salary-tax()+bonus()));
         System.out.println("Toplam maaş"+ (this.salary+raiseSalary()+bonus()-tax()));



     }


}
