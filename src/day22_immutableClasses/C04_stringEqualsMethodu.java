package day22_immutableClasses;

public class C04_stringEqualsMethodu {
    public static void main(String[] args) {
/*
Java stringlerde her seferinde yeni obje oluşturmamak içim string havuzu oluşrurur
eğer string oluşturulurken bugüne kadar yaptığımız gibi basit bir şekilde oluşturulusa havuza kontrol eder ve bunu kullanır

 */

        String str1="Java";
        String str2="Java";
        String str3=new String("Java");
        String a="Ja";
        String b="va";
        String str4=a+b;
        String str5=a.concat(b);

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str4));//true
        System.out.println(str1.equals(str5));//true
        //equals sadece değerler bakar
        //== hem değere hem atamaya bakar

        System.out.println("**********************");
        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//false
        System.out.println(str1==str5);//false
        System.out.println(str1=="Java");//true




    }
}
