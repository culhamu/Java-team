package Day13_methodOverloading_WhileLoop;

import Day12_MethodOlusturmaVeKullanma.C02_asalSayi;
import Day12_MethodOlusturmaVeKullanma.C07_terseCevirme;
import Day12_MethodOlusturmaVeKullanma.C08_Fibonacci;

public class C01_methodCall {
    public static void main(String[] args) {
        // asagidaki cümleyi tersine çevirin
        String str="Bir kere yaparim yan gelir yatarim";
        System.out.println(C07_terseCevirme.metniTerseCevir(str));
        // ilk 15 fibonacci sayısını yazdırın
        C08_Fibonacci.fibonaccidenSayiYazdir(15);
        //Aşagıda verilen cümlenin palindrome olup olmadığını yazdırın
        str="Java candir";
        String tersStr=C07_terseCevirme.metniTerseCevir(str);
        if (str.equals(tersStr)){
            System.out.println("Palindrome");
        }else System.out.println("Palindrome değil");

        //Aşağıda verilen sayının asal olup olmadığını yazdırın
        int sayi=230;
        System.out.println(C02_asalSayi.asalSayiMi(sayi));
        //kullanıcı true/false den birşey anlamazsa
        boolean sonuc=C02_asalSayi.asalSayiMi(sayi);

        if (sonuc){
            System.out.println("Girilen "+sayi+" asal");
        }else System.out.println("Girilen "+sayi+" asal değil");

    }
}
