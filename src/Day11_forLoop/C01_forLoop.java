package Day11_forLoop;

import java.util.Scanner;

public class C01_forLoop {
    public static void main(String[] args) {
        // kullanıcıdan bir char alıp o karakterden sonra gelen 10 karakteri yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir herf giriniz");
        char krk=scan.next().charAt(0);
         for (int i=1;i<10;i++){
             System.out.print((char) (krk+i)+" ");
         }
    }
}
