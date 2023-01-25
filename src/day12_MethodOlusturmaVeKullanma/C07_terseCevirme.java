package day12_MethodOlusturmaVeKullanma;

public class C07_terseCevirme {
    public static void main(String[] args) {
        //verilen bir stringi terse çevirip
        //o halini bize döndüren bir method oluşturun
        System.out.println(metniTerseCevir("Java"));


    }public  static String metniTerseCevir(String str){
        String tersStr="";
        for (int i =str.length()-1; i >=0 ; i--) {
            tersStr += str.charAt(i);

        }return tersStr;
    }
}
