package Day18_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12_fibonacci {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen pozitif bir n tamsayisini alarak,
         bize ilk n tane tane Fibonacci sayisini bir list olarak donduren bir method olusturun.
         */
        System.out.println(fibonacciListesiOlustur());

    }public static List<Integer> fibonacciListesiOlustur(){
        List<Integer> fibonacci=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kaç tane fibonacci sayısı istediğinizi pozitif bir tamsayı olarak giriniz");
        int n=scan.nextInt();

        if (n<1){
            System.out.println("geçersiz sayı");
            return null;
        } else if (n==1) {
           fibonacci.add(0);
           return fibonacci;
        } else if (n==2) {
            fibonacci.add(0);
            fibonacci.add(1);
            return fibonacci;
        }else {
            int sayi1=0;
            int sayi2=1;
            int sayi3=1;
            fibonacci.add(sayi1);
            fibonacci.add(sayi2);

            do {
                fibonacci.add(sayi3);
                sayi1=sayi2;
                sayi2=sayi3;
                sayi3=sayi1+sayi2;


            }while (fibonacci.size()<n);
            return fibonacci;
        }

    }
}
