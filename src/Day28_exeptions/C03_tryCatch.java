package Day28_exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_tryCatch {
    public static void main(String[] args) {
        /*
        kullanıcıdan tıoplamak üzere sayılar alın
        kullanıcının bitirmesi için Q ya basmasını isteyin
        kllanıcı Q ya bastığında toplam kaç sayı girdiğini
        ve bu sayıların toplamını yazdırın
         */
        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int sayiAdedi=0;
        int sayilarToplami=0;
        while (sayiAdedi<10000){
        try {

                System.out.println("Lütfen toplamak için tam sayı giriniz\n"+"Bitirmek için Q ya basın");
                girilenSayi=scan.nextInt();
                sayilarToplami+=girilenSayi;
                sayiAdedi++;


        } catch (InputMismatchException e) {
            String girilenDeger=scan.nextLine();

            if (girilenDeger.equalsIgnoreCase("q")){
                System.out.println("girilen " +sayiAdedi+" sayının toplamı : "+sayilarToplami);
                break;
            }else System.out.println("Geçersiz input");
          }
        }
    }
}
