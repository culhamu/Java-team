package Day24_StringBuilder;

public class C06_Encaptulation {
    public static void main(String[] args) {
        /*
        Access modifiers bir class üyesine erişimi sınırlamdırırken görme yetkisiniz(read) ve
        değiştirme yetkisini(write) ayırt edemez.

        ama gerçek hayatta buna ihtiyaç vardır
        Bazı class üyelerinin readable olması lazımken
        Bazı class üyelerinin writable olması lazım
        Ve Bazı class üyelerinin her iki yetkiyede sahip olması istenir

        Java bu yetkilendirme işlemini Encaptulation ile çözmüştür

        sadece yazma yetkisi için setter methodu
        sadece okuma yetkisi için getter methodu
        her ikisi içinde getter ve setter methodu kullanılır
         */
        Encapsulation obj1=new Encapsulation();
     obj1.setSatis(100);
     obj1.setSatis(200);
     obj1.setSatis(300);
     obj1.setSatis(400);

        System.out.println(Encapsulation.getToplamSatis());

        obj1.setHalkaAcikSayi(400);
        System.out.println(obj1.getHalkaAcikSayi());
    }
}
