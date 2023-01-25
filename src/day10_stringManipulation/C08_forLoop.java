package day10_stringManipulation;

public class C08_forLoop {
    public static void main(String[] args) {
        /* 1 ile bin arasındaki sayıları yanyana yazdırın tüm bu sayılatın toplamını yazdırın

         */
        int sayilarinToplami=0;
        for (int i=1;i<=1000;i++){

            //sayilarinToplami=sayilarinToplami+i;
            sayilarinToplami+=i;


        }System.out.println("Sayilarin toplami:"+sayilarinToplami);
    }
}
