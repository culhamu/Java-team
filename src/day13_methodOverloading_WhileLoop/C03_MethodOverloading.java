package day13_methodOverloading_WhileLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {

        toplama(5.4,6.3);
        toplama('s','k');//integer ve double toplamı222.0
        //herne kadar char olsada java ascii ye göre alır
        // ilk olarak %100 uyumlu parametreler arar
        //eğer %100 uyumlu yoksa çalışabilecek method varmi diye kontrol eder
        //çalışacak method birden fazla ise min. casting yapacağı methodu kullanır
        toplama(8.4,6);//2 double toplamı14.4

    }
    public static void toplama(int sayi2,double sayi1){

        System.out.println("integer ve double toplamı"+(sayi1+sayi2));
    }
    public static void toplama(double sayi1,double sayi2){
        System.out.println("2 double toplamı"+(sayi1+sayi2));

    }
}
