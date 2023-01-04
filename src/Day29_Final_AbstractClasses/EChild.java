package Day29_Final_AbstractClasses;

public class EChild extends DParent {
    @Override
    public void method1() {
        System.out.println("Parent Class daki mecburi override edilecek method1 override ettik");
    }

    @Override
    public void method2() {
        System.out.println("Parent Class daki mecburi override edilecek method2 override ettik");

    }

    /*
    Clasic inheritance ile parentt child ilişkisi oluşturduğumuz da
    parent class daki tüm özellikleri otomatik olarak kazanırız
    ancak methodları overriding etme
    ister override edip özelleştiririz istersek de parent class dakini kullanu-ırız
     */
    public static void main(String[] args) {
        //DParent obj1=new DParent();
        //'DParent' is abstract; cannot be instantiated
        //Abstarct class ların constructor ları vardır ama obje üretilemez

        EChild chld1=new EChild();
        chld1.method1();//Parent Class daki mecburi override edilecek method1 override ettik
        chld1.method2();//Parent Class daki mecburi override edilecek method1 override ettik
        chld1.method3();//Parent class daki method 3 çalıştı

        DParent chld2=new EChild();
        chld2.method1();
        chld2.method2();
        chld2.method3();
    }
}
