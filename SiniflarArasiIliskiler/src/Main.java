public class Main {
    public static void main(String[] args) {

         Student s1=new Student("ismail","özdoğan","123","niğde merkez",85);
         Student s2=new Student("sena","özdoğan","1234","niğde merkez",85);
         Student s3=new Student("özlem","özdoğan","12345","afyon merkez",85);

         Instarctor i=new Instarctor("Mahmut","Hoca","Mat");

         Student[] stu={s1,s2,s3};

         Course mat=new Course("Mat","12",i);

          System.out.println((mat.getInstarctor().getName()));
          System.out.println(mat.claculate(stu));


        }
    }
