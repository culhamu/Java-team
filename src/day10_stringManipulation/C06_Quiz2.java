package day10_stringManipulation;

public class C06_Quiz2 {
    public static void main(String[] args) {
        /*
        Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
              - ilk harf kucuk harf olmali
             - son karakter rakam olmali
             - sifre bosluk icermemeli
            - uzunlugu en az 10 karakter olmali
         */
       String sifre="abc1453";
       int flag=0;
       if (!(sifre.charAt(0)>='a'&&sifre.charAt(0)<='z')){
           System.out.println("Ilk harf küçük olmalı");
           flag++;
       }if (!(sifre.charAt(sifre.length()-1)>='0'&&sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmalı");
            flag++;

        }if (sifre.contains(" ")){
            System.out.println("sifre bosluk içermemeli");
            flag++;

        }if (!(sifre.length()>=10)){
            System.out.println("şifre en az 10 karakter içermeli");
            flag++;

        }if (flag==0)System.out.println("şifre başarıyla kaydedilmiştir");
    }
}
