package Day11_forLoop;

import java.util.Scanner;

public class C05_forLoop {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
         sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
         Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen baslangic ve bitis degerleri için iki pozitif tamsayi giriniz");
        int baslangic= scan.nextInt();
        int bitis=scan.nextInt();
        if (bitis<baslangic){
            System.out.println("uyarı:baslangıç değeri bitiş değerinden küçük olmalı");
        }else {
            int toplam=0;
            for (int i=baslangic;i<=bitis;i++){
                toplam+=i;
            }
        }System.out.println(baslangic+"ile"+bitis+"değerler toplamı:");


    }
}
