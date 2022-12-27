package Day13_methodOverloading_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan toplamak üzere sayi alin
        //girilen sayının toplamı 500 olur veya geçerse
        //bukadar sayı yeter diyip toplamı yazdırın


        //bu soruyu illa da forloop ile yapalım dersek
        //adiim sayısını tahmin edip biraz abartabiliriz

        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayi=0;
        for (int i = 1; i <10000 ; i++) {
            System.out.println("toplamak üzere tamsayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;

            if (toplam>=500){
                System.out.println("bukadar sayı yeter diyip toplamı:"+toplam+"oldu");
                break;
            }

        }
        //aynı soruyu while loop ile yapalım
        toplam=0;
        sayi=0;
        while (toplam<500){
            System.out.println("toplamak üzere tamsayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;

        }
        System.out.println("bukadar sayı yeter diyip toplamı:"+toplam+"oldu");
        //Eğer adım dayısı belli ise forloop adım dayısı belli değilse whileloop ile yaparız
    }
}
