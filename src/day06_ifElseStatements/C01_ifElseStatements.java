package day06_ifElseStatements;

import java.util.Scanner;

public class C01_ifElseStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenarlarını giriniz");
        double dbl1= scan.nextDouble();
        double dbl2= scan.nextDouble();
        double dbl3= scan.nextDouble();
        if (dbl1==dbl2 && dbl2==dbl3 && dbl1>0) {
            System.out.println("Eşkener üçgendir");}else {
            System.out.println("Eşkenar üçgen değildir");}


    }
}
