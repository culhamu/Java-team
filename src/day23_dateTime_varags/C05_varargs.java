package day23_dateTime_varags;

public class C05_varargs {
    public static void main(String[] args) {
        //verilen iki sayıyı toplayıp yazdıran bir method oluşturun
        topla(5,8);
        topla(5,7,3);
        topla(4,9,3,7);
    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println(sayi1+sayi2+sayi3+sayi4);
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println(sayi1+sayi2+sayi3);
    }

    private static void topla(int sayi1, int sayi2) {
        System.out.println(sayi1+sayi2);
    }
}
