package Day08_stringManpulations;

public class C03_stringEquals {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Java";
        String str3=new String("Java");
        String str4="Ja";
        String str5=str4.concat("Va");

        System.out.println(str1==str2);//true

        System.out.println(str2==str3);//false

        System.out.println(str1==str5);//false
        /*
        == işareti string de beklenen sonucu vermeyebilir bunun yerine (equals) kulllanılmalıdır.

         */
        System.out.println(str1.equals(str5));//true
    }
}
