package day35_GenelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_BolmeIslemSonucunuCarpmaIleBulma {
    public static void main(String[] args) {
        //Kullanıcıdab bölünecek sayı ve bölecek sayıyı alıp bölme işleminin sonucunu
        //Çarpma islemi ile bulan ve yazdıran bir method oluşturun
        //Bu işlemi kullanıcı Q ya basıncaya kadar devam ettirin
        Scanner scan=new Scanner(System.in);
        boolean devamEdelimMi=true;
        int bolunecekSayi=1;
        int bolenSayi=1;
        do {
            System.out.println("Lütfen Bölünecek tamsayıyı giriniz,\n Bitirmek için Q ya basın");
            try {
                bolunecekSayi=scan.nextInt();
                System.out.println("Lütfen bölecek sayıyı giriniz");
                bolenSayi=scan.nextInt();
                bolumSonucunuYazdir(bolunecekSayi,bolenSayi);
            } catch (InputMismatchException e) {
                String girilenStr=scan.next();//18. satırda nextInt() ile değeri alamadıysa
                                              //exep oluşacak bu satıra gelecek ve o değeri nextline ile alacağız
                if (girilenStr.equalsIgnoreCase("Q")){
                    devamEdelimMi=false;
                }else {
                    System.out.println("Bölünecek sayi tamsayı olmalıdır");
                }
            }

        }while (devamEdelimMi);
    }

    private static void bolumSonucunuYazdir(int bolunecekSayi, int bolenSayi) {
        //bolunecek sayı be bolen sayı negatif veya pozitif olabilir
        //bu durumda öncelikle işaret kontrolü yapmamız lazım
        //işaret sorununu çözmek için önce işlem sonucunun işaretini belirleyip


        int sonucIsareti=1;
        if (bolunecekSayi*bolenSayi<0){
            sonucIsareti=-1;
        }
        //sonra sayılari işaretten bağımsız hale getirelim
        bolunecekSayi=bolunecekSayi>=0?bolunecekSayi:bolunecekSayi*(-1);
        bolenSayi=bolenSayi>=0?bolenSayi:bolenSayi*(-1);

        int bolumSonucu=1;
        while (bolumSonucu*bolenSayi<bolunecekSayi){
            bolumSonucu++;
        }
        if (bolumSonucu*bolenSayi==bolunecekSayi) {
            System.out.println("Bölme işleminin sonucu : " + bolumSonucu * sonucIsareti);
        }else System.out.println("Bölme işlemi sonucu: "+(bolumSonucu-1));
    }
}
