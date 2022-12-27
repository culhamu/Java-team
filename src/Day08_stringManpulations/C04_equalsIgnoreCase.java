package Day08_stringManpulations;

public class C04_equalsIgnoreCase {
    public static void main(String[] args) {
        String str1="Pazar";
        String str2="PAZAR";
        String str3="pazar";
        String str4="PAzaR";

        System.out.println(str1==str3);//false
        System.out.println(str2==str4);//false

        System.out.println(str1.equals(str2));//false
        System.out.println(str3.equals(str4));//false

        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str3.equalsIgnoreCase(str4));//true sadece karşılaştırma yaparken kullanılır


    }
}
