package day35_GenelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_PrintfCarpimTablosu {
    public static void main(String[] args) {
        //Kullanıcıdan bir rakam alın ve carpim tamlosu oluşturun
        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        while (girilenSayi<2||girilenSayi>9) {
            try {
                System.out.println("Lütfen carpim tablosu oluşturmak için bir rakam giriniz");
                girilenSayi=scan.nextInt();
                if (girilenSayi>1&&girilenSayi<10){
                    break;
                }
                System.out.println("Çarpim tablosu için 1'den büyük rakam girmelisiniz");
            } catch (InputMismatchException e) {
                scan.next();
                System.out.println("Çarpim tablosu için 1'den büyük rakam girmelisiniz");

            }
        }
        for (int i = 1; i <=girilenSayi ; i++) {
            for (int j = 1; j <=girilenSayi ; j++) {
                int carpim=i*j;
                System.out.printf("%-5d   ",carpim);

            }
            System.out.println("");

        }

    }
}
