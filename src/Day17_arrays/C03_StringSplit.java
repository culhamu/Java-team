package Day17_arrays;

import java.util.Arrays;

public class C03_StringSplit {
    public static void main(String[] args) {
        String str= "Java her geçen gün güzelleşiyor";
        //str da kaç kelime var?
        // split methodu istediğimiz stringi istediğimiz ayraç kullanarak ayırmamıza imkan verir
        String[] spaceSplit=str.split(" ");
        System.out.println(Arrays.toString(spaceSplit));//[Java, her, geçen, gün, güzelleşiyor]
        System.out.println("verilen cümledekikelime sayısı: "+spaceSplit.length);//verilen cümledekikelime sayısı: 5
        System.out.println(Arrays.toString(str.split("e")));//[Java h, r g, ç, n gün güz, ll, şiyor]
        System.out.println(Arrays.toString(str.split("gün")));//[Java her geçen ,  güzelleşiyor]
        System.out.println(Arrays.toString(str.split("")));
        //[J, a, v, a,  , h, e, r,  , g, e, ç, e, n,  , g, ü, n,  , g, ü, z, e, l, l, e, ş, i, y, o, r]em
    }
}
