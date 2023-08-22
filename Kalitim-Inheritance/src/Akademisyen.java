public class Akademisyen extends Calisan{

    private String bolum;
    private  String unvan;

    public Akademisyen(){}
    //Akademisyen constraktri extend edilen calisan konstaraktirinin özelliklerini almak zorunda ve this metodu yerine super
    //metodu kullanirli
    public Akademisyen(String adSoyad, String telefon, String eposta,String bolum,String unvan) {
        super(adSoyad, telefon, eposta);
        this.bolum=bolum;
        this.unvan=unvan;
    }

    public String Getbolum(){
        return this.bolum;
    }
    public void Setbolum(String bolum){
        this.bolum=bolum;
    }

    public String Getunvan(){
        return this.unvan;
    }
    public void Setunvan(String unvan){
        this.unvan=unvan;
    }

    public void dersegir(){
        System.out.println(this.getAdSoyad()+" akademisyen derse giris yaptı");
    }

    @Override
    public void giris(){
        System.out.println(this.getAdSoyad()+" Akdemisyen A kapisindan giris yapti");

    }

}
