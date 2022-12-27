package Day21_staticKeyword;

public class C04_passByValue {
    public static void main(String[] args) {
        double fiyat=100;

        //%10 %20 %30 indirim uygulayıp fiyatı yazdıran üç methodu uygulayalım
        indirimYap10(fiyat);
        indirimYap20(fiyat);
        indirimYap30(fiyat);

        System.out.println(fiyat);

    }public static void indirimYap10(double fiyat){
    fiyat=fiyat*0.9;
        System.out.println("%10 indirimli fiyat"+fiyat);

    }public static void indirimYap20(double fiyat) {
        fiyat = fiyat * 0.8;
        System.out.println("%20 indirimli fiyat" + fiyat);
    }public static void indirimYap30(double fiyat) {
        fiyat = fiyat * 0.7;
        System.out.println("%30 indirimli fiyat" + fiyat);
    }
}
