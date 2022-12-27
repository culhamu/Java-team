package Day06_ifElseStatements;

import java.util.Scanner;

public class C08_ifElseIf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ürün adedini giriniz");
        int urnadedi=scan.nextInt();
        System.out.println("Lütefen liste fiyatı");
        double lstFiyati=scan.nextDouble();

        System.out.println("Müşteri Kartınız var mı?\nE: Evet, H: Hayır");
        char kartVarmi=scan.next().charAt(0);

        if (kartVarmi=='E'&& urnadedi>10){
            System.out.println("%20 indirimli fiyatı:"+urnadedi*lstFiyati*0.8);
        } else if (kartVarmi=='E'&& urnadedi>0) {
            System.out.println("%15 indirimli fiyatı:"+urnadedi*lstFiyati*0.85);
            
        } else if (kartVarmi=='H'&& urnadedi>10) {
            System.out.println("%15 indirimli fiyatı:"+urnadedi*lstFiyati*0.85);
            
        } else if (kartVarmi=='H'&& urnadedi>0) {
            System.out.println("%10 indirimli fiyatı:"+urnadedi*lstFiyati*0.9);

        }else {
            System.out.println("hatalı bilgi");
        }

    }
}
