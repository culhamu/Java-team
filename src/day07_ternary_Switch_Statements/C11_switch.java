package day07_ternary_Switch_Statements;

import java.util.Scanner;

public class C11_switch {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen gün numarasını giriniz");
        int gunNo= scan.nextInt();

        switch (gunNo) {
            case 1 :

            case 2 :

            case 3 :

            case 4 :

            case 5 :
                System.out.println("Hafta içi");
                break;
            case 6:

            case  7:
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Gün sayısı geçersiz");
        }
    }
}
