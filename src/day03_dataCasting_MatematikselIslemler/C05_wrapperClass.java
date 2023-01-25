package day03_dataCasting_MatematikselIslemler;

public class C05_wrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        Integer sayi2=10;
        String str="Java Candır";
        String str1="125";
        String str2="256";
        int str1int= Integer.parseInt(str1);
        int str2int=Integer.parseInt(str2);
        System.out.println(str1int*str2int);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        char krk1='&';
        System.out.println(Character.isDigit(krk1));
        System.out.println(Character.isLetter(krk1));
        Character.isAlphabetic(krk1);


    }
}
