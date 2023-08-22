public class Lab_Asistani extends Asistan{

    public Lab_Asistani() {
    }

    public Lab_Asistani(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }

    public void lablaraGir(){
        System.out.println(this.getAdSoyad()+" lablara girdi");
    }



}
