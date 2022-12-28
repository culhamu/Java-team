package Day25_Inheritance;

public class APersonel {
    protected String isim="İsim atanmadı";
    protected String soyIsim="Soyisim atanmadı";
    protected String telefon="Telefon atanmadı";
    public static void main(String[] args) {

    }protected   void maas(){
        System.out.println("Hastanemizde uygulanan asgari ücret 1700 euro dur");
    }protected void ozelSigorta(){
        System.out.println("Tüm personelin özel sağlık sigortası yaptırılır");
    }private void privateMethod(){
        System.out.println("Private method çalıştı ");
    }
}
