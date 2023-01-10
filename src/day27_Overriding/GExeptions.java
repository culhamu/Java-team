package day27_Overriding;

public class GExeptions {
    public static void main(String[] args) {
        int a=23;
        int b=0;

        //bu kodda paydanın 0 olması öngörülebilecek bir risktir
        //kodu yazarken çözülebilecek bir durumdur

        if (b!=0){
            System.out.println("iki sayının bölümü : "+a/b);
        }else System.out.println("Bölecek sayı 0 olamaz");
    }
}
