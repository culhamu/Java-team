package day05_if_Statements;

import java.util.Scanner;

public class C01_ifStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not=scan.nextDouble();
        if (0<=not && not<50){
        System.out.println("Notunuz DD,maalesef kaldınız."); }

        if (50<=not && not<65){
            System.out.println("Notunuz CC,Tebrikler Geçtiniz."); }

        if (65<=not && not<85){
            System.out.println("Notunuz BB."); }

        if (85<=not && not<=100){
            System.out.println("Notunuz AA,Çok Güzel."); }











    }
}
