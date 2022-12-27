package Day03_dataCasting_MatematikselIslemler;

public class C02_expilicitNarrowing {
    public static void main(String[] args) {

        double dbl=25.3;
         int sayi=(int)dbl;
        System.out.println(sayi);
        byte byt=(byte)sayi;
        System.out.println(byt);
             sayi=135;
             byt =(byte)sayi;
        System.out.println(+byt);
        /*
        eğer geniş kapasiteli data türünden dar kapasiteli bir data türüne casting yaparsanız bunu java yapmaz
         */

    }
}
