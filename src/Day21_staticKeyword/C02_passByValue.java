package Day21_staticKeyword;
/*
java pass by value kulanır
yani methodlar arası gönderilen variable ların kendilerini değil değerlerini gönderir
 */
public class C02_passByValue {
    public static void main(String[] args) {
        int fiyat=100;
        // fiyat üzerinden %10 indirim yapıp indirimli fiyatı döndüren bir method oluşturun

        System.out.println(indirimYap10(fiyat));//90
        System.out.println(fiyat);//100

    }public static int indirimYap10(int fiyat){
        fiyat=fiyat*90/100;
return fiyat;
    }
}
