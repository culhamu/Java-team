package Day11_forLoop;

public class C02_forLoop {
    public static void main(String[] args) {
        //input olarak verilen bir stringde indeksi tek sayı olanları küçük harfle
        //indexi çift sayı olanları büyük harfle yazdırın
        String input="Java candir, Selenium heyecandır";
        for (int i=0;i<input.length();i++){
            System.out.print(i%2==0
                    ?input.substring(i,i+1).toUpperCase()
                    :input.substring(i,i+1).toLowerCase());
        }
    }
}
