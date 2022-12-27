package Day13_methodOverloading_WhileLoop;

import java.util.Scanner;

public class C06_SifreKontrolu {
    public static void main(String[] args) {

         /*
        Soru 4 : Kullanicidan bir sifre isteyip,
         asagidaki sartlari kontrol edin ve
         kullaniciya duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa,
         “sifre basariyla kaydedildi” yazdirin
              - ilk harf kucuk harf olmali
             - son karakter rakam olmali
             - sifre bosluk icermemeli
            - uzunlugu en az 10 karakter olmali
            sifre kontrolunu bir methodda yapıp true /false dondurun
            main methodda dönen sonucu kontrol edip
            "basari ile olusturuldu"yazıncaya kadar şifreyi tekrar tekrar sorun
         */
        Scanner scan=new Scanner(System.in);

        boolean tekrarSifreIste=true;

        String sifre="";

        while (tekrarSifreIste){

            System.out.println("lütfen şifrenizi giriniz");
            sifre=scan.nextLine();

            if (sifreKontrolEt(sifre)){//sifre kontrolu true ise basasılı demektir
                System.out.println("basarılı ile olusturuldu");
                break;
                //tekrarSifreIste=false;   bu da olabilir
            }
        }


    }public static boolean sifreKontrolEt(String sifre){
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


        }
        if (flag==0){
        return true;
        }else return false;
    }
}
