package day09_stringManipulation;

public class C09_test {
    public static void main(String[] args) {

        // Gittigimiz web sayfasindan aldigimiz
        // String arama sonuclarinda
        // arama sayisinin 50'den fazla oldugunu test edin

        String input = "1-48 of 87 results for \"nutella\"";
        int indexOf=input.indexOf("of");
        int indexResult=input.indexOf("result");

        String sonucSayisiString=input.substring(indexOf+3,indexResult-1);
        int sonucSayısıInt=Integer.parseInt(sonucSayisiString);

        if (sonucSayısıInt>50){
            System.out.println("Nutella arama testi passed");
        }else {
            System.out.println("Nutella arama testi FAİLED");
        }


    }
}
