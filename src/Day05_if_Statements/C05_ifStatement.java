package Day05_if_Statements;

import java.util.Scanner;

public class C05_ifStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklrını giriniz");
        int  a=scan.nextInt();
        int  b=scan.nextInt();
        int  c=scan.nextInt();

        if (a==b && b==c&& a>1) System.out.println("üçgen eşkenar üçgendir");

    }
}
