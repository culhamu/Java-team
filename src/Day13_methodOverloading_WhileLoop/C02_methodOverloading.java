package Day13_methodOverloading_WhileLoop;

public class C02_methodOverloading {
    public static void main(String[] args) {
        String str="Java Çok güzel";
        str.substring(5);
        str.substring(3,5);
        //eğer seçtiğimiz isimde birden fazla method varsa buna overloading denir.
        //hangisinin çalışacağına argument/parametre karar verir
        toplama(5,6);//11
        toplama(11.2,12.5);
        /*
        Java aynı class içerisinde aynı isim ve aynı data türünden paramatre türünden
        method oluşturmanıza izin vermez
        1-ismini değiştirebiliriz ancak bu durumda overloading olmaz
        overloading aynı isimde ama farklı işleve sahip methodlar demektir
        2-parametre sayısını değiştirebiliriz
         */
        toplama(3,5);
        toplama(4,5,9);


    }public static void toplama(int sayi1,int sayi2){
        System.out.println("iki tamsayının toplamı:"+(sayi1+sayi2));
    }public static void toplama(int a,int b,int c){
        System.out.println("3 tamsayının toplamı:"+(a+b+c));


    }public static void toplama(double sayi1,int sayi2){
        System.out.println("double ve integer toplamı"+(sayi1+sayi2));

    }
    public static void toplama(int sayi2,double sayi1){

        System.out.println("integer ve double toplamı"+(sayi1+sayi2));
    }
    public static void toplama(double sayi1,double sayi2){
        System.out.println("2 double toplamı"+(sayi1+sayi2));

    }
}
