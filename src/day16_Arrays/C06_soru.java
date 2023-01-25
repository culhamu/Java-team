package day16_Arrays;

public class C06_soru {
    public static void main(String[] args) {
        //bir marketin fiyatlarını tutan bir array var
        //bu marketteki en yüksek ve en düşük fiyatları yazdıran bir array oluşturun
        double[] fiyatlar={23,4,1,34.5,42.1,45.2,3.4,23.5};
        enyuksekEndusukFiyat(fiyatlar);
    }public static void enyuksekEndusukFiyat(double[] fiyatlar){
        double endusukFiyat=fiyatlar[0];
        double enyuksekFiyat=fiyatlar[0];
        for (int i = 0; i < fiyatlar.length; i++) {
           if (fiyatlar[i]<endusukFiyat){
               endusukFiyat=fiyatlar[i];
           }if (fiyatlar[i]>enyuksekFiyat){
               enyuksekFiyat=fiyatlar[i];
            }

        }
        System.out.println(endusukFiyat);
        System.out.println(enyuksekFiyat);

    }
}
