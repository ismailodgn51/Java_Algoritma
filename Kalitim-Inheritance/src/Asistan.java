public class Asistan extends Akademisyen {
    private String ofisSaati;

    public Asistan() {
    }

    public Asistan(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.ofisSaati = ofisSaati;
    }

    public String GetofisSaati(){
        return this.ofisSaati;
    }
    public void SetofisSaati(String ofisSaati){
        this.ofisSaati=ofisSaati;
    }

    public void quizYap(){
        System.out.println(this.getAdSoyad()+" Quiz yapti");
    }

}
