package Day24_StringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        //kapasitesi 16 olanboş bir Stringbuilder oluşturur
        System.out.println(sb1);//16

        StringBuilder sb2=new StringBuilder(11);
        System.out.println(sb2);//boş bir satır yazdırır
        System.out.println(sb2.capacity());//11
        System.out.println(sb2.length());//0

        StringBuilder sb3=new StringBuilder("Java candir ");
        System.out.println(sb3);
        System.out.println(sb3.capacity());//27


        sb2.append("Java");
        //trimToSize= kapasiteye göre kırp atıl kapasiteyi kırpar
    }
}
