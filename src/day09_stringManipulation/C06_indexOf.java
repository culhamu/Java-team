package day09_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Java ile kodlama çok kolay";
        System.out.println(str.contains("çok"));

        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf("v"));
        System.out.println(str.indexOf("çok"));
        System.out.println(str.indexOf('a', 5));
        System.out.println(str.indexOf('o', 15));
        int ilkOIndexi=str.indexOf('o');
        int ikinciOIndexi=str.indexOf('o',ilkOIndexi+10);
    }
}
