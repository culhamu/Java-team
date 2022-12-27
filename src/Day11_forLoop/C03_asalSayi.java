package Day11_forLoop;

public class C03_asalSayi {
    public static void main(String[] args) {
        //input olarak verilen bir sayının asal olup olmadığını yazdırınız
        int input=23;


        for (int i=2;i<input;i++){
            if (input%i==0){
                System.out.println("sayı asal değil");
                break;

            }
        }
        System.out.println("sayı asal");
    }
}
