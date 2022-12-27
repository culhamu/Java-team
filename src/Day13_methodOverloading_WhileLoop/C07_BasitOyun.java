package Day13_methodOverloading_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_BasitOyun {
    public static void main(String[] args) {
        /*

        random olarak 1 ile 100 arasında bir syaı oluşturun,
        kullanıcıdan bu sayıyı bulmasıını isteyin
        kulanıcı her değer girdiğinde
        ttuttuğumuz sayi ile karşılaştırıp buyult/kuçult diyelim
        kullanıcı tuttuğumuz sayıyı bildiğinde
        -3 veya daha az tahminde bildiğinde"vaawwww"
        -4-8 tahminde bildiyse"aferin"
        daha fazla tahminde bildiyse "basarisiz"
        count yap while
        -
         */
        Random rnd=new Random();
        int tutulanSayi=rnd.nextInt(100);
        int sayac=1;
        int tahmin=0;


        Scanner scan=new Scanner(System.in);
        int girilenSayi=scan.nextInt();

        while (tutulanSayi!=tahmin){
            System.out.println("lütfen 0-100 arasında bir sayi giriniz");
            tahmin=scan.nextInt();
            if (tutulanSayi==tahmin){
                System.out.println(sayac+" tahmin ile tutulansayıyı bildim");
            }

        }












        }

    }

