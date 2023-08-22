public class Memur  extends Calisan{
    private String depertman;
    private String mesai;


    public Memur(String adSoyad, String telefon, String eposta, String depertman, String mesai) {
        super(adSoyad, telefon, eposta);
        this.depertman = depertman;
        this.mesai = mesai;
    }

    public String getDepertman() {
        return depertman;
    }

    public void setDepertman(String depertman) {
        this.depertman = depertman;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public void calis(){
        System.out.println(this.getAdSoyad()+" görevlerini yapiyor");
    }
}
