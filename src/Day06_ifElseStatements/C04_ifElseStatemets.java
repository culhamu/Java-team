package Day06_ifElseStatements;

import java.util.Scanner;

public class C04_ifElseStatemets {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);

         if (girilenKarakter>='A' && girilenKarakter<='Z'){
            System.out.println("girilen harf büyük");}else{
            System.out.println("girilen karakter büyük değil");}
    }
}
