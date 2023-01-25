package day23_dateTime_varags;

public class C07_varargs {
    public static void main(String[] args) {
        //kaçtane String argümnet yaılırsa yazılsın argümentlerin en uzun olanını yazdıran bir method oluşturun
        //birden fazla varsa ilkini yazdırın
        enUzunuYazdir("İlyas","Beriven","Murat");
    }

    private static void enUzunuYazdir(String ...kelimeler) {
        String enUzunKelime=kelimeler[0];
        for (String each:kelimeler) {

            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }

        }
        System.out.println(enUzunKelime);
    }
}
