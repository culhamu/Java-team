package Day02_variables_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Sayı1 Giriniz");
        int sayi1=scan.nextInt();
        System.out.println("Lütfen Sayı2 Giriniz");
        int sayi2=scan.nextInt();
        int temp;
        temp=sayi2;
       sayi2=sayi1;
       sayi1=temp;
        System.out.println("Sayıların Değerini Değiştirdim " +
                "\n Sayi1'in Değeri:" + sayi1 +
                "\n Sayi2'nin Değeri:"+sayi2);
    }
}
