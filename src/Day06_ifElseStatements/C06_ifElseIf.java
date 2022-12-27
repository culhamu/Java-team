package Day06_ifElseStatements;

import java.util.Scanner;

public class C06_ifElseIf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz \nK: Kadın,E: Erkek");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas=scan.nextInt();

        if ((cinsiyet=='K'||cinsiyet=='k')&& yas>=60){
            System.out.println("Emekli olabilir");
        } else if ((cinsiyet=='K'||cinsiyet=='k')&& yas>=18) {
            System.out.println("Emekli olmak için:"+(60-yas)+"Yıl çalışmalıdır");
            
        } else if ((cinsiyet=='E'||cinsiyet=='e')&& yas>=65) {
            System.out.println("Emekli olabilir");
        } else if ((cinsiyet=='E'||cinsiyet=='e')&& yas>=18) {
            System.out.println("Emekli olmak için:"+(65-yas)+"Yıl daha çalışmalıdır"); {

        }

    }
        {
            
        }

    }
}
