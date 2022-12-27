package Day09_stringManipulation;

public class C08_test {
    public static void main(String[] args) {
        // Gittigimiz web sayfasindan aldigimiz
        // String arama sonuclarinda
        // arama sayisinin 50'den fazla oldugunu test edin

        String input = "1-48 of 87 results for \"nutella\"";

        int index=input.indexOf("87");
        String str=input.substring(index, index + 2);
        int sayi=Integer.parseInt(str);
        if(sayi>50){
            System.out.println("arama sonucu 50 den fazla");
        }else{
            System.out.println("arama sonucu 50 den az");
        }


    }
}
