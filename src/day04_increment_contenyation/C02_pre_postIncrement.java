package day04_increment_contenyation;

public class C02_pre_postIncrement {
    public static void main(String[] args) {
        int a=10;
        int b=a++;
        int c=++a;
        System.out.println(a+","+b+","+c);
        int x=20;
        int y=++x;
        int z=x++;
        System.out.println(x+","+y+","+z);
        int sayi1=40;
        int sayi2=sayi1++;
        int sayi3=--sayi2;
        int sayi4=--sayi1;
        System.out.println(sayi1 +","+sayi2+","+sayi3+","+sayi4);






    }
}
