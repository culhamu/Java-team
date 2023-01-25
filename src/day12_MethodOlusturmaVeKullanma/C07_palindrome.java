package day12_MethodOlusturmaVeKullanma;

public class C07_palindrome {
    public static void main(String[] args) {
        // verilen bir stringin palindrome olup olumadığını yazdırın
        //düz okunusunu ve tersten okunuşunun aynı olup olmadığını kontrol eder

        String str="Ey edip adanada pide ye";
        String tersStr=C07_terseCevirme.metniTerseCevir(str);
        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("Verilen metin palindrome");
        }else System.out.println("Verilen metin palindrome değil");




    }
}
