package day23_dateTime_varags;

public class C08_varargs {
    public static void main(String[] args) {
        islemYap(3,4,5,6,8);
    }

    private static void islemYap(int ilkSayi ,int ...geriyeKalanlar) {
        int geriyeKalTop=0;
        for (int each:geriyeKalanlar) {
            geriyeKalTop+=each;
        }
        System.out.println(geriyeKalTop*ilkSayi);
    }
}
