package day09_stringManipulation;

import java.util.Scanner;

public class C05_endsWith {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen mail hesabınızı giriniz");
        String girilenMail=scan.nextLine();

        if (!girilenMail.contains("@")){
            System.out.println("Geçersiz mail");


        } else if (!girilenMail.contains("@gmail")) {
            System.out.println("Mail gmail olmalı");
            
        } else if (!girilenMail.endsWith("@gmail.com")) {
            System.out.println("mail de yazım hatası");
            
        }
    }
}
