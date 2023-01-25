package day22_immutableClasses;

public class C03_immutableClasses {
    public static void main(String[] args) {
        String str="Java";

        str.replaceAll("J","H");//Java

        str=str.replaceAll("J","H");

        System.out.println(str);//Hava
    }
}
