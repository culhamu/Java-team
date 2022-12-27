package Day14_DoWileLoop_Scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        //verilen baslangic ve bitis karakterleri dahil aradaki tüm karakterleri yazdırın
        char baslangic = 'd';
        char bitis = 'm';
        do {
            System.out.println(baslangic);
            baslangic=(char) (baslangic+1);

        }while (baslangic<=bitis);
    }
}
