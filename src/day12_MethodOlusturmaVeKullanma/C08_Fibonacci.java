package day12_MethodOlusturmaVeKullanma;

public class C08_Fibonacci {
    public static void main(String[] args) {

        //verilen sayı adedince fibonacci satısı kadar bir method oluşturun
        //fibonacci = 0 1 1 2 3 5 8 13 21 34 ....
        fibonaccidenSayiYazdir(6);
    }

    public static void fibonaccidenSayiYazdir(int adet) {
        if (adet<=0){
            System.out.println("Geçersiz giriş");
        } else if (adet==1) {
            System.out.println("0");

        } else if (adet==2) {
            System.out.println("0 1");

        }else {
            int sayi=0;
            int asyi2=1;
            int sayi3=0;
            System.out.print("0 1 ");
            for (int i = 3; i <=adet; i++) {
                sayi3=asyi2+sayi;
                System.out.print(sayi3+" ");
                sayi=asyi2;
                asyi2=sayi3;

                
            }
            System.out.println("");
        }
    }
}
