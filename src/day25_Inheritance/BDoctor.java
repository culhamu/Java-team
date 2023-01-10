package day25_Inheritance;

public class BDoctor extends APersonel{
    public static void main(String[] args) {
// oluşturduğumuz doktor ckassın da isim soyisim gibi
        //tüm özelliklerin olmasını istiyorsak 2 yöntem var
        //1_istenen tüm özellikleri doctor classında yeniden oluşturabiliriz.
        //2_doctor classını personel classının childi yapmak

        //doctor classını personel classının childi yaptığımızda
        //doctor classından oluşturulan objeler sadece kendi classının özelliklerine
        //sahip olmazlar personel classındaki variable yi kullanabiliriz
        //bir child class dan obje oluşturduğumuzda
        //o objenin özellikleri belirlenir ken öncelikle o class da ki özellik uygulanır
        //eğer o class da yoksa parent class a bakılır
        //onda da yoksa cte verir
        // bir class extends keywords kullanarak başka classı kendisine parent edinirse
        //1_parent daki tüm özellikleri kendi kullanabilir(isim,soyisim,telefon)
        //2_parent class daki bir özelliği kendisine göre uyarlayabilir(maas)
        //3_isterse parentte olmayan özellikler oluşturup kullanabilir(özelsigorta)

        BDoctor dok1=new BDoctor();
        dok1.isim="Kemal";
        dok1.soyIsim="Bulut";

        System.out.println(dok1.isim+" ,"+dok1.soyIsim+" ,"+dok1.telefon);
        //Kemal ,Bulut ,Telefon atanmadı
dok1.maas();
dok1.ozelSigorta();
dok1.nobet();

    }public void maas(){
        System.out.println("Doktor maaşı 30*8*25 "+6000);
    }public void nobet(){
        System.out.println("Doktorlar haftada bir nöbet tutar");
    }
}
