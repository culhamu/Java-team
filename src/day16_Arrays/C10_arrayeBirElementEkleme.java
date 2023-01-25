package day16_Arrays;

import java.util.Arrays;

public class C10_arrayeBirElementEkleme {
    public static void main(String[] args) {
        /*
        Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
         eski array’e yeni degeri atayin.
         */
        String[] isimler={"ali","veli","cem"};
        String ekleme="Kemal";
        isimler=arrayeElementEkleme(isimler, ekleme);
        System.out.println(Arrays.toString(isimler));

    }
    public static String[] arrayeElementEkleme(String []eklenilecekarr,String eklenecekElement){
        String [] temp=new String[eklenilecekarr.length+1];
        for (int i = 0; i < eklenilecekarr.length; i++) {
            temp[i]=eklenilecekarr[i];
        }
        temp[temp.length-1]=eklenecekElement;
        return temp;
    }
}
