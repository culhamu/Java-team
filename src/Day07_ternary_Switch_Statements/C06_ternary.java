package Day07_ternary_Switch_Statements;

import java.util.Scanner;

public class C06_ternary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi=scan.nextInt();

        System.out.println(sayi%5==0 ? "sayı 5 in katı" : "sayi 5 in katı değil");
    }
}
