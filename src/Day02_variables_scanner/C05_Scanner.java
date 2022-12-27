package Day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Isminizi Yazınız");
        String GirilenIsim=scan.nextLine();
        System.out.println(GirilenIsim.toUpperCase());
        Scanner scan2=new Scanner(System.in);
        System.out.println("Soyisminizi Yazınız");
        String GirilenSoyisim=scan2.nextLine();
        System.out.println(GirilenSoyisim.toUpperCase());
    }
}
