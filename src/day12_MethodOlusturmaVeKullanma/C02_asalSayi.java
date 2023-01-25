package day12_MethodOlusturmaVeKullanma;

public class C02_asalSayi {
    public static void main(String[] args) {
        // virilen bir sayının asal olup olmadığını döndüren true false oluşturun

    }
    public static boolean asalSayiMi(int input){
        boolean asalSayiMi=true;
        for (int i = 2; i <=input-1 ; i++) {
            if (input%i==0){
                asalSayiMi=false;
                break;
            }


        }return asalSayiMi;
    }
}
