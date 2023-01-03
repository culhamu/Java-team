package Day28_exeptions;

import java.util.Scanner;

public class C01_tryCatch {
    public static void main(String[] args) {
        //kullanıcıdan iki tam sayı alıp
        //sayıları birbirinr bölüp sonucu yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("birbirine bölmek için 2 tamsayı giriniz");
        int sayi1=scan.nextInt(), sayi2=scan.nextInt();
        try {
            //try kısmı yapmak istediğimiz ama exeptions riski oluşturan kodlar
            System.out.println("İki sayının bölümü : "+ sayi1/sayi2);
        } catch (Exception e) {
            //catch(): beklediğimiz muhtemel exc deklare ettiğimiz ve
            //        bu exc. gerçekleşirse hata dökümanını store edebileceğimiz variable
            throw new RuntimeException(e);
            //catch bloğu :gerçekleşirse çalışmasını istediğimiz kodlar
            //             burası yazarken öncelikle
            //             exc/oluştuğunda kodların çalışması dursun mu?yoksa devam mı etsin karar
             //              vermeliyiz
        }

    }
}
