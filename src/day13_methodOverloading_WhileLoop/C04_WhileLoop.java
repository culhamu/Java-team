package day13_methodOverloading_WhileLoop;

public class C04_WhileLoop {
    public static void main(String[] args) {
        //2 basamaklı sayılardan 7 ile bölünebilenleri yazdırın

        for (int i = 10; i <100 ; i++) {
            if (i%7==0){
                System.out.print(i+" ");
            }

        }
        System.out.println("");
        // aynı soruyu while loop ile yapalım
        int sayi=10;
        while (sayi<100){
            if (sayi%7==0){
                System.out.print(sayi+ " ");
            }sayi++;
        }
        // forLoop ile yapılabilecek bir soruyu While ile yapmak biraz zahmetli


    }
}
