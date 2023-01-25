package day08_stringManpulations;

import java.util.Random;

public class C06_length {
    public static void main(String[] args) {

        String str="Java her çen gün güzelleşiyor";

        System.out.println(str.charAt(str.length()-3));
        // rastgele bir karakter için

        Random rnd=new Random();
        int index= rnd.nextInt(str.length());
        System.out.println(str.charAt(index));
    }
}
