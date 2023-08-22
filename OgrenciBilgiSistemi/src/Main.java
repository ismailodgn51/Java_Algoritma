
public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("ismail","TRH","555");
        Teacher t2 = new Teacher("GHambel","FZK","000");
        Teacher t3 = new Teacher("külyutmaz","BIO","222");


        Course tarih=new Course("tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik=new Course("fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyoloji=new Course("biyoloji","103","BIO");
        biyoloji.addTeacher(t3);


        Student s1 =new Student("inek şaban", "123","4",tarih,fizik,biyoloji);
        s1.ogrencinotekle(100,100,30);
        s1.isPAss();


    }
}