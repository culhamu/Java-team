package day16_Arrays;

public class C07_soru {
    public static void main(String[] args) {
        /*
        Verilen bir array’de istenen bir elemanin var olup olmadigini
        ve varsa kac kere kullanildigini yazdiran bir method olusturun.
         */
        int [] arr={2,3,4,2,6,7,4,1,9,8,4,2,3,5};
        int arananSayi=2;

    }public static void elemanbul(int [] arr,int arananSayi){
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arananSayi)
                sayac++;


        }
    }
}
