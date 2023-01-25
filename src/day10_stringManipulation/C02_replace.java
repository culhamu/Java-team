package day10_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {
        String str="Java ogren adana ye";
        System.out.println(str.replace("a", "A"));
        System.out.println(str.replace(" ", ""));
        String tlfn="5554546978";
        System.out.println(tlfn.replace("555", "532"));
        System.out.println(str.replace('o', 'ö'));
        /*
        1-16 of over 100,000 results for “apple”
         */
        String sonuc="1-16 of over 100,000 results for “apple”";
        int inexOver=sonuc.indexOf("over");
        int indexResult=sonuc.indexOf("results");
        String sonucSayisiStr=sonuc.substring(inexOver + 5, indexResult - 1);
        sonucSayisiStr=sonuc.replace(",","");
        int sonucSayisiInt=Integer.parseInt(sonuc);
        if (sonucSayisiInt>10000){
            System.out.println("arama sonuc testi PASSED");
        }else {System.out.println("arama sonuc testi FAİLED");}


    }
}
