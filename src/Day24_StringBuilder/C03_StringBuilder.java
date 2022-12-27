package Day24_StringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1==sb2);//false
        System.out.println(sb1.equals(sb2));//false
        // StringBuilder karşılaştırmak için compareto yu kullanır

        System.out.println(sb1.compareTo(sb2));//0

        StringBuilder sb3=new StringBuilder("Hava");

        System.out.println(sb1.compareTo(sb3));//2

        sb3=new StringBuilder("Tava");

        System.out.println(sb1.compareTo(sb3));//-10

        sb3=new StringBuilder("Jaka");

        System.out.println(sb1.compareTo(sb3));//11

        sb3=new StringBuilder("Javax");

        System.out.println(sb1.compareTo(sb3));//-1

        sb3=new StringBuilder("Java candir");

        System.out.println(sb1.compareTo(sb3));//-7

        //System.out.println(sb1==str); data türleri farklı olduğu için karşılaştırma yapmaz cte verir

        System.out.println(sb1.equals(str));// kabul eder ama false verir
        //System.out.println(sb1.compareTo(str)); compareTo stringbuildir den başka data kabul etmez
    }
}
