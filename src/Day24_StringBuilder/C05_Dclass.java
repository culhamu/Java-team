package Day24_StringBuilder;

public class C05_Dclass {
    private String isim="Mustafa";
    String isimDefault="Furkan";
    static String isimDefaultStatic="Sevilay";

    public static void main(String[] args) {

        C05_Dclass obj1=new C05_Dclass();
        System.out.println(obj1.isim);

        staticMethod();
        System.out.println(obj1.isim);
    }

    private void staticolmayanmethod(){
        isim="Hüseyin";
        System.out.println(isim);
    }private static void staticMethod(){
        C05_Dclass obj1=new C05_Dclass();
        obj1.isim="Zafer";
        System.out.println(obj1.isim);
    }static void defaultStaticMethod(){
        System.out.println("static olan çalıştı");
    }void defaultStaticOlmayanMethod(){
        System.out.println("static olmayan çalıştı");
    }
}
