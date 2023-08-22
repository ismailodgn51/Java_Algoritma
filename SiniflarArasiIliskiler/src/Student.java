public class Student {

    private String name;
    private String surname;

    private String idno;

    private String adress;

    private int not;

    public Student(String name, String surname, String idno, String adress, int not) {
        this.name = name;
        this.surname = surname;
        this.idno = idno;
        this.adress = adress;
        if (not<0 || not>100){
            not=0;
        }
        this.not = not;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        if (not<0 || not>100){
            not=0;
        }
        this.not = not;
    }
}
