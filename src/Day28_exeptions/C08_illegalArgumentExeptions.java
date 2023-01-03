package Day28_exeptions;

import java.util.Scanner;

public class C08_illegalArgumentExeptions {
    public static void main(String[] args) {
        /*
        kullanıcıdan yaşını girmesini isteyin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yasınızı giriniz");
        int yas=scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException("Hata");

            }else {
                System.out.println("Yaşınız kaydedildi");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
