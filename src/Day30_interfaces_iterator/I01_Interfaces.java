package Day30_interfaces_iterator;

public interface I01_Interfaces {

    //interface larda tüm methodlar public ve abstract tır
    //interface lerde tüm variable lar public static final dır yazsak ta yazmasak da
    //final olduğu için sonradan değer ataması olmaz oluştururken değer atanmalıdır

    int SAYI=10;
    public static final String OKUL_ISMI="Yıldız koleji";
    public int SAYI2=20;

    void method1();

    public int method2();
    abstract String method3();
    public abstract void method4();

    void method();

    void method5();
    /*
    bir interface e yeni bir method eklediğimizde
     */

    public default void method44() {

    }

}
