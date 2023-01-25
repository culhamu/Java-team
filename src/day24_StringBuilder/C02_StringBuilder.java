package day24_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java");

        System.out.println(sb.capacity());//20 16+java
        System.out.println(sb.length());//4 java

        sb.trimToSize();//StringBuilder mutable olduğu için methodlarla oluşturulan değişiklikler kalıcı olur

        System.out.println(sb.capacity());//4

        sb.toString().toLowerCase();//Java
        //StringBuilder ı stringe çevirirsek mutable özelliği kalkar


       // sb=sb.toString().toUpperCase();
        //non-primitive data türlerinde farklı data türüne atama yapılmaz

        StringBuilder sb2=new StringBuilder(sb.toString().toUpperCase());
        System.out.println(sb2);//JAVA

        sb.setCharAt(0,'H');//Hava

        System.out.println(sb.substring(2,3));//v

        System.out.println(sb);//HAVA

        sb.reverse();
        System.out.println(sb);//AVAH

        sb.insert(1,"H ");
        System.out.println(sb);


        String uzunMetin="Etmek yok çalışmak var";

        sb.insert(6,uzunMetin,0,10);

        System.out.println(sb);//aH vaHEtmek yok

        sb.indexOf("a",3);
        System.out.println(sb.indexOf("a",3));//4
        System.out.println(sb.indexOf("vaH"));//3
        System.out.println(sb.lastIndexOf("vaH"));//3

        sb.replace(0,12,"Sorun");
        System.out.println(sb);//Sorunyok
        sb.delete(5,sb.length());//başlangıç indexi dahil bitiş indexi dahil değil
        System.out.println(sb);//Sorun



    }
}
