package Day10_stringManipulation;

import java.util.Scanner;

public class C09_forLoop {
    public static void main(String[] args) {

        // Kullanicidan başlangıç vebitiş değerlerini alıp sınırla dahil 5in katı olan sayıları yazdirin
        Scanner scan=new Scanner(System.in);

        System.out.println("Baslangiç degerini giriniz");
        int baslangic= scan.nextInt();
        System.out.println("Bitiş değerini giriniz");
        int bitis=scan.nextInt();
        for (int i=baslangic;i<=bitis;i++){
            if (i%5==0){
                System.out.println(i+" ");
            }
        }
    }
}
