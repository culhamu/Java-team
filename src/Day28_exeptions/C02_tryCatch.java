package Day28_exeptions;

import java.util.Scanner;

public class C02_tryCatch {
    public static void main(String[] args) {

        //tryCatch bloklarını amacı risli 0 yapmak değil kodun iyş analiz yapıp java nın
        //ne istediğimizi kendisine söylemektir

        //java try bloğunda handle(başedemeceği) bir sorunla karşılaşırsa
        //siz o sorunu deklare edene kadar çalışmayı durdurur catch alanına kadar olan yeri çalışmayı durdurur



        //kullanıcıdan iki tam sayı alıp
        //sayıları birbirinr bölüp sonucu yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("birbirine bölmek için 2 tamsayı giriniz");
        int sayi1=scan.nextInt(), sayi2=scan.nextInt();

        try {
            System.out.println("İki sayının bölümü : "+ sayi1/sayi2);

            System.out.println("Kontrol 1");
            System.out.println("Kontrol 2");
            System.out.println("Kontrol 3");
        } catch (ArithmeticException e) {
            System.out.println("bölen sayı 0 olamaz");

            e.printStackTrace();
        }
    }
}
