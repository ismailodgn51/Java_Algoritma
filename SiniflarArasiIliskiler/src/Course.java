public class Course {
    private String courseName;
    private String code;
    private Instarctor Instarctor;

    Course(String courseName,String code,Instarctor Instarctor){
        this.courseName=courseName;
        this.code=code;
        this.Instarctor=Instarctor;
    }

    public String GetcourseName(String courseName){
        return this.courseName;
    }
    public void Setcoursename(){
        this.courseName=courseName;
    }
    public String Getcode(String code){
        return this.code;
    }
    public void Setcode(){
        this.code=code;
    }

    public Instarctor getInstarctor() {
        return this.Instarctor;
    }

    public void setInstarctor(Instarctor instarctor) {
        this.Instarctor = instarctor;
    }

    public double claculate(Student[] students){

        double avarage=0;
        for (Student student:students){

            avarage+=student.getNot();

        }


        return (avarage/students.length);
    }
}
