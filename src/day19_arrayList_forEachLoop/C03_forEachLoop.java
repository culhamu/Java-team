package day19_arrayList_forEachLoop;

public class C03_forEachLoop {
    public static void main(String[] args) {
        /*
        erğer çoklu element içeren bir yapıdaki tüm elementlere
        aynı işlemi  yapmak istiyorsak indeksten bağımsız olarak for each loop kullanılabilir
        foreach loop ta3 şeyi belitmemiz gerekir
        1 -getirilececk elementlerin data türü

        2-getirilen elemente verilecek isim(genelde each denir veya w kullanılır

         3- nereden getirileceği

         */
        int[] arr={2,4,6,8,1};
        //bu array in tüm elemanlarını yazdıralım
        for (int each: arr
             ) {
            System.out.print(each+" ");
            
            //tüm elementleri toplayalım
            

                
            }int toplam=0;
        for (int each: arr
        ) {
            toplam+=each;

        }System.out.println(toplam);
        //tüm sayıların karelerini toplayalım
        toplam=0;
        for (int each:arr) {
            toplam+=each*each;

        }
        System.out.println("satıların kareleri toplamı: "+toplam);
    }
}
