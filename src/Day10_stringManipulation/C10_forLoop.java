package Day10_stringManipulation;

public class C10_forLoop {
    public static void main(String[] args) {

        int inputbaslangic=34;
        int inputbitis=563;

        int sayac=0;
        int toplam=0;

        for (int i=inputbaslangic;i<=inputbitis;i+=7){
            System.out.print(i+" ");
            sayac++;
            toplam+=i;
        }
        System.out.println("");
        System.out.println("toplam"+sayac+"adet sayı var"+"\n"+"sayıların toplamı:"+toplam);
    }
}
