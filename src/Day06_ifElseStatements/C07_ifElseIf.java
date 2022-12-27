package Day06_ifElseStatements;

import java.util.Scanner;

public class C07_ifElseIf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo=scan.nextDouble();
        System.out.println("Lütfrn boyunuzu cm türünden yazınız");
        double boy=scan.nextDouble();
        double vke=kilo*10000/(boy*boy);

        System.out.println("Vücut Kitle Endeksi:" + vke);

        if (vke>=30) System.out.println("obezsiniz, geç kalmadan kendine çeki düzen vermelisiniz");
        else if (vke>=25) {
            System.out.println("Kilolusunuz, rejime başlamalısınız");



        } else if (vke>=20) {
            System.out.println("normal, Böyle devam edin");

        }else System.out.println("Zayıfsınız, Kilo almalısınız");
    }
}
