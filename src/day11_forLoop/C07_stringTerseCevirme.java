package day11_forLoop;

public class C07_stringTerseCevirme {
    public static void main(String[] args) {
        /*
        Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
         */
        String str="Java ogrenmek icin cok calısmak lazım";
        String yeniStr="";

        for (int i=str.length()-1;i>=0;i--){
            yeniStr+=str.substring(i,i+1);
        }
        System.out.println(yeniStr);

    }
}
