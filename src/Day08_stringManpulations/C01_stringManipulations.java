package Day08_stringManpulations;

import java.util.Scanner;

public class C01_stringManipulations {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz");
        String girilenGun= scan.next();

        String kullanilacakGun=girilenGun.toLowerCase();

        switch (kullanilacakGun){
            case "pazartesi":
                System.out.println(girilenGun+" Çalışma zamanı, tatile 5 gun var");
                break;
            case "sali":
                System.out.println(girilenGun+" Çalışma zamanı, tatile 4 gun var");
                break;
            case "carsamba":
                System.out.println(girilenGun+" Çalışma zamanı, tatile 3 gun var");
                break;
            case "persembe":
                System.out.println(girilenGun+" Çalışma zamanı, tatile 2 gun var");
                break;
            case "cuma":
                System.out.println(girilenGun+" Çalışma zamanı, tatile 1 gun var");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println(girilenGun+" Simdi dinlenme zamani");
                break;
            default:
                System.out.println("Hatali gun girisi");

        }




    }
}
