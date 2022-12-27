package Day06_ifElseStatements;

import java.util.Scanner;

public class C02_ifElseStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenarlarını giriniz");
        double dbl1= scan.nextDouble();
        double dbl2= scan.nextDouble();
        double dbl3= scan.nextDouble();

        if ((dbl1==dbl2 && dbl1!=dbl3) || (dbl3==dbl2 && dbl2!=dbl1) ||(dbl3==dbl1 && dbl3!=dbl2)){
            System.out.println("ikizkenar üçgendir");}else {
            System.out.println("İkizkenar üçgen değildir");}
    }
}
