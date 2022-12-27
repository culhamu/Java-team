package Day02_variables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen İsminizi Giriniz");
        String girilenİsim=scan.nextLine();
        System.out.println("Lütfen Soyisminizi Giriniz");
        String girilenSoyisim=scan.nextLine();
        System.out.println("Lütfen Yaşınızı Giriniz");
        String girilenYas=scan.nextLine();
        System.out.println("İsminiz:"+ girilenİsim +
                           " \nSoyisminiz:"+girilenSoyisim +
                            " \n Yaşınız:"+ girilenYas +
                             "\n Kyadınız Başarıyla Tamamlanmıştır.");
    }
}
