package day12_MethodOlusturmaVeKullanma;

public class C03_faktoriyel {
    public static void main(String[] args) {
        // verilenn bir sayının 15 den küçük bir sayı olduğunu kontrol edin
        //küçükse bir method geliştirinn faktöriyel ini hesplayın yazdirin
        int input=23;
        if (input>0&&input<15){
            faktoriyelYazdir(input);
        }else System.out.println("Uyarı");




    }
    public static void faktoriyelYazdir(int sayi){
        int faktoriyelSonuc=1;
        for (int i = sayi; i >=1 ; i++) {
            faktoriyelSonuc*=i;

        }
        System.out.println( "girilen sayının faktöriyeli:"+faktoriyelSonuc);

    }
}
