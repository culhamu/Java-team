package Day05_if_Statements;

import java.util.Scanner;

public class C04_ifStatement {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen harf giriniz");
        char krk=scan.next().charAt(0);

        if (krk=='a' || krk=='A'){
            System.out.println("Ararlık");}

        if (krk=='o' || krk=='O'){
            System.out.println("Ocak");}

        if (krk=='ş' || krk=='Ş'){
            System.out.println("Şubat");}

        if (krk=='m' || krk=='M'){
            System.out.println("Mart veya Mayıs");}

        if (krk=='N' || krk=='n'){
            System.out.println("Nisan");}

        if (krk=='h' || krk=='H'){
            System.out.println("Haziran");}

        if (krk=='t' || krk=='T'){
            System.out.println("Temmuz");}





    }
}
