package day16_Arrays;

import java.util.Arrays;

public class C04_soru {
    public static void main(String[] args) {
        //verilen bir string array de istenen bir harfi içeren kelimeleri silip yerine null yazdırın
        String [] isimler={"huseyin","akile","yusuf","mehmet","said"};
        String silinecekHarf="u";
        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].contains(silinecekHarf)){
                isimler[i]=null;
            }

        }
        System.out.println(Arrays.toString(isimler));
    }
}
