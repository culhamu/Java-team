package day08_stringManpulations;

public class C07_subString {
    public static void main(String[] args) {

        String str="Java öğren işi kap";
        System.out.println(str.length());//18
        System.out.println(str.charAt(str.length()/2));//ortasındaki karakter
        System.out.println(str.charAt(str.length()-1));// son karakter
        System.out.println(str.substring(5, 10));//öğren
        System.out.println(str.toUpperCase().substring(0, 5));//JAVA
        System.out.println(str.substring(15, 18));//kap
        System.out.println(str.substring(str.length() - 3));//kap
        System.out.println(str.substring(0, 1));
        System.out.println(str.toUpperCase().substring(9, 10));//N
        System.out.println(str.toUpperCase().charAt(9));//N
        System.out.println(str.substring(5, 5));// hiçlik yani boş
    }
}
