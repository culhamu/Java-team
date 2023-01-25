package day14_DoWileLoop_Scope;

public class C05_scope {
    int sayi=10;
    static int number;
    public static void main(String[] args) {
        String mainStr="Java";
        number=10;
        for (int i = 0; i <10 ; i++) {
            int toplam=i;

        }
       // System.out.println(toplam); fop loop içinde olduğu için dışında kullanılamaz
    }
    public static void method1(){
        String methodStr="Güzeldir";
        number=20;

    }public void method2(){
        String method2Str="Candır";
        number=30;

    }
}
