package day19_arrayList_forEachLoop;

public class C06_forEachLoop {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir cumle ve bir harf alin,
         harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
         kullanilmadiysa “harf cumlede kullanilmamis” yazdirin
         */
        String cumle="Java ogrenmek çok güzel";
        String harf="a";
        String[] cumleArr=cumle.split("");
        int count=0;
        for (String eachHarf:cumleArr) {
            if (eachHarf.equals(harf)){
                count++;
            }
            
        }if (count==0){
            System.out.println("harf cümlede kullanılmamış");
        }else System.out.println("harf cümlede " + count + " defa kullanılmış");
    }
}
