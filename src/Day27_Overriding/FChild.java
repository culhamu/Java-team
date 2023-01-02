package Day27_Overriding;

public class FChild extends EParent{
    @Override
    protected void method1() {
        super.method1();
        //eğer override meethod ile overriding method çalışsın istersek super.method1() yazabiliriz
        //static final ve private method lar overriding edilemez
    }

    @Override
    protected void method2() {
        super.method2();
    }
    public void method3(){
        System.out.println("Child method3");
        //parent class da aynı isimde method olmasına rağmen override olarak görülmedi
        //çünkü parent daki method 3 private access modifiere sahip olduğundan onu ayrı bir method olarak görür
        // override olarak görmez
    }
}
