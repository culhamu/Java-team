package Day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C08_sayınınRakamlarToplamınıBulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("\"Dört Basamaklı Bir Sayı Giriniz\"");
        int sayi=scan.nextInt();
        sayi=2457;
        int birlerBasamagı=0;
        int rakamlarToplama=0;
        birlerBasamagı=sayi%10;
        rakamlarToplama=birlerBasamagı+rakamlarToplama;
        sayi=sayi%10;
        birlerBasamagı=sayi%10;
        rakamlarToplama=birlerBasamagı+sayi;
        sayi=sayi%10;
        rakamlarToplama=birlerBasamagı+rakamlarToplama;
        sayi=sayi%10;
        rakamlarToplama=birlerBasamagı+sayi;

        System.out.println("Rakamlar toplamı:"+ rakamlarToplama);
    }
}
