public class Parika
{
    public static void main(String[] args) {

        Calisan c1=new Calisan("İsmail özdoğan","05344584420","iso51@gmail.com");

        Akademisyen a1=new Akademisyen("İsmail özdoğan","05344584420","iso51@gmail.com","dsa","dsadsa");

        Memur m1=new Memur("sebahattin","05379222566","sebo51@gmail.com","Çay","8-5");

        OgretimGorevlisi o1=new OgretimGorevlisi("sinan","321321","dsadsa","dsa","ddsadsa,","22");

        Lab_Asistani lab=new Lab_Asistani("merve","321321","dsadsa","dsa","ddsadsa,","22");

       //Overloading methodlarda aşiri yüklenme
     //   lab.giris("10.00","19.00");
      //  lab.giris();

        //Ovveride
        //öğretim elemanında overridin işlemi yapilarak ezilen giriş fonsiyonu çalisir aşağıda
       // o1.giris();

        //Polimorfizim(çok biçimlilik) Asistan gibi davran ama akedmisyen methodlarini çağır
        Akademisyen a=new Asistan("merve","321321","dsadsa","dsa","ddsadsa,","22");
         a.dersegir();
        Asistan b=new Asistan("merve","321321","dsadsa","dsa","ddsadsa,","22");
        b.dersegir();

         //Poliformizm devam
        Calisan[] loginUser={c1,a1,m1,o1,lab};
        Calisan.loginUser(loginUser);




    }
}
