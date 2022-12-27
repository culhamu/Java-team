package Day06_ifElseStatements;

import java.util.Scanner;

public class C09_nestedIfElse {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz \nK: Kadın,E: Erkek");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas=scan.nextInt();
        if (cinsiyet=='K'||cinsiyet=='k'){}
    }
}
