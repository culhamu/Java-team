package day23_dateTime_varags;

public class C09_varargs {
    public static void main(String[] args) {
             /*
          Argument olarak tamsayilar alip
          son argument haric geriye kalanlari toplayip
          bulunan toplami ilk argument ile carpip
          sonucu yazdiran bir method olusturun
          (Not argument sayisi degisken olabilir)
         */
        islemYap(3,4,5,8,1,2); // 60
        islemYap(5,1); // 5
        islemYap(4); // 0
        islemYap(3,4,5,6); // 45
    }
    private static void islemYap(int ilkSayi, int... geriyeKalanlar) {
        int geriyeKalanlarToplami=0;
     //varargs sınırsız sayıda element alma özelliğine sahiptir
        //dolaysı ile varargs olarak tanımlanan bir parametreden sonra
        //parametre kullanılırsa cte verir
        //çünkü varargs sonraki tüm parametreleri almak ister
        //o yüzden bu sorunun varargs il çözümü yok
    }
}
