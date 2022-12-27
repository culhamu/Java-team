package Day14_DoWileLoop_Scope;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
        bulunuz, tamkare ise true değilse false yazdırınız.
        Ornek : input : 16, output: 4
         */
        int input=144;
        int Karekok=1;
        boolean sonuc=false;

        do {
            if (Karekok*Karekok==input){
                System.out.println(Karekok);
                sonuc=true;
                break;
            }else Karekok++;

        }while (Karekok*Karekok<=input);

        System.out.println(sonuc);

    }
}
