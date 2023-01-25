package day23_dateTime_varags;



public class C06_varargs {
    public static void main(String[] args) {
        // öyle bir method oluşturalım ki kaç tane argümenet yazarsam yazatım args toplamını versin
        topla(5,6);
        topla(5,4,6,6,4,8,5,12,5,1,23,12,5,6);

        //varargs array alt yapısını kullanır temel hedef
        // argüment sayısı deişse bile tüm argüment aynı data türünde ki
        // tüm args alabilecek bir parametre oluşturmaktır
    }

    private static void topla(int... sayilar) {
        int topla1=0;
        for (int i = 0; i < sayilar.length; i++) {
            topla1+=sayilar[i];
        }
        System.out.println(topla1);
        int topla2=0;
        for (int each:sayilar) {
        topla2+=each;
        }
        System.out.println(topla2);
    }
}
