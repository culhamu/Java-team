package Day28_exeptions;

public class C07_exceptionsTurleri {
    public static void main(String[] args) {

        String str="234";

        //str a sayısal olarak 5 ekleyin

        System.out.println(Integer.parseInt(str)+5);
        //eğer str içinde sayı olmayan bir karakte olursa
        //NumberFormatException olur

        Object sayiObj=str;
        Integer sayiInt=(Integer) sayiObj;

        System.out.println(sayiInt);//ClassCastException verir
    }
}
