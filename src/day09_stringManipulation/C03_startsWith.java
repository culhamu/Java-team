package day09_stringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {

        String str="Java mutluluktur";
        System.out.println(str.startsWith("Java"));
        System.out.println(str.startsWith("j"));
        System.out.println(str.startsWith("Java mutluluktur"));
        System.out.println(str.startsWith(""));
        System.out.println(str.contains("mutlu"));
        System.out.println(str.startsWith("mutlu", 5));
        System.out.println(str.startsWith("va", 2));
    }
}
