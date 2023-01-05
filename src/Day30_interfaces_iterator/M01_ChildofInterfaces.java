package Day30_interfaces_iterator;

public class M01_ChildofInterfaces implements I01_Interfaces,I02_Interfaces{

    //bir class başka bir class a extends keywords ile parent edinebilir
    //ancak bir den fazla class ı parent edinemez .

    //interfaces ler için böyle bir sınırlama yoktur
    //birden fazla parent edinebilir
    public static void main(String[] args) {

        System.out.println(I01_Interfaces.SAYI2);
       // I02_Interfaces.SAYI2=25;
        //Cannot assign a value to final variable 'SAYI2'


        //eğer birden fazla interfaceler implement edilirse
        //return type bakılır aynı typr da return type ları varsa sıkıntı olmaz
        //return type ları farklı ise CTE verir bu durumun düzeltilmesi gerekir
    }
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method() {

    }

    @Override
    public void method5() {

    }

    @Override
    public int method6() {
        return 0;
    }
}
