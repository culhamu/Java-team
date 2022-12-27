package Day06_ifElseStatements;

import java.util.Scanner;

public class C03_ifElseStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char girilenKarakter=scan.next().charAt(0);

        if (girilenKarakter>='a' && girilenKarakter<='z'){
            System.out.println((char) (girilenKarakter-32));
            System.out.println(Character.toUpperCase(girilenKarakter));}
        else {
            System.out.println(girilenKarakter);}
    }
}
