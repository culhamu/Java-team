package Day10_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C05_Quiz {
    public static void main(String[] args) {

        /*
        Soru 1 : Kullanicidan bir cumle alin
     - cumlede ev geciyorsa, “home home sweet home” yazdirin
     - cumlede is geciyorsa, “calismak guzeldir”
     - ikisini de iceriyorsa “Hem ev lazim hem is”
     - hicbirini icermiyorsa “cok calisman lazim” yazdirin
         */
        String str="Evden calisiyorum, ise gitmeye gerek yok";
        String calisilacakStr=str.toLowerCase();
         if (calisilacakStr.contains("ev")&&str.contains("is")){
             System.out.println("Hem ev lazim hem is");
         } else if (calisilacakStr.contains("is")) {
             System.out.println("calismak guzeldir");

         } else if (calisilacakStr.contains("ev")) {
             System.out.println("home home sweet home");

         }else System.out.println("cok calisman lazim");
    }
}
