package Day06_ifElseStatements;

import java.util.Scanner;

public class C10_nestedIfElse {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ürün adedini giriniz");
        int urnadedi=scan.nextInt();
        System.out.println("Lütefen liste fiyatı");
        double lstFiyati=scan.nextDouble();

        System.out.println("Müşteri Kartınız var mı?\nE: Evet, H: Hayır");
        char kartVarmi=scan.next().charAt(0);
        if (kartVarmi=='E' || kartVarmi=='e'){
            if (urnadedi<=0) System.out.println("Geçersiz ürün adedi");
            else if (kartVarmi=='E'&& urnadedi>10) {
                System.out.println("%15 indirimli fiyatı:"+urnadedi*lstFiyati*0.85);


        } else if (kartVarmi=='H' || kartVarmi=='h') {

        }else System.out.println("Hatalı kart bilgisi");}
    }
}
