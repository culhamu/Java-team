package Day24_StringBuilder;

public class C04_AccessModifier {

    String str;
    //Access modifier i gözlerimizle göremiyorsak default modifier vardır

    // bu class da default constructor var
    //str ın değeri null dır(default deger)
    //str access modifier i default access modifier
    public static void main(String[] args) {

        C05_Dclass obj1=new C05_Dclass();
        System.out.println(obj1.isimDefault);//Furkan
        obj1.defaultStaticOlmayanMethod();//"static olmayan çalıştı"

        System.out.println(obj1.isimDefaultStatic);//Sevilay
        System.out.println(C05_Dclass.isimDefaultStatic);//Sevilay

       obj1.defaultStaticMethod();//static olan çalıştı
       C05_Dclass.defaultStaticMethod();//static olan çalıştı
    }
}
