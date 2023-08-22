public class Calisan {

    private String adSoyad;
    private String telefon="0";

    private String eposta;

    public Calisan(){}
    public Calisan(String adSoyad, String telefon, String eposta) {
        this.adSoyad = adSoyad;
        if (telefon.length()>5){
            this.telefon = telefon;
        }else System.out.println("hata");

        this.eposta = eposta;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void giris(){
        System.out.println(this.getAdSoyad()+"  Üniye giriş yapti");
    }
    public void giris(String giris,String cikis){
        System.out.println(this.getAdSoyad()+" "+giris+"  Üniye giriş yapti"+" "+cikis+" üdinden çikis yapti");
    }
    public void cikis(){
        System.out.println(this.getAdSoyad()+"  Üniye çikis yapti");
    }
    public void yemekhane(){
        System.out.println(this.getAdSoyad()+"   yemekhaneye giriş yapti");
    }

    public static void loginUser(Calisan[] loginUsers){
        for (Calisan calisans:loginUsers){
            calisans.giris();
        }
    }
}