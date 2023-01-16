package day35_GenelTekrar;

import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        //verilen bir linkedlist te istenen iki index teki elementlerin yerlerini değiştirin
        LinkedList<String> isimler=new LinkedList<>();
        isimler.add("Said");
        isimler.add("Hüseyin");
        isimler.add("Hasan");
        isimler.add("Sevilay");
        isimler.add("Hümeyra");
        System.out.println(isimler);//[Said, Hüseyin, Hasan, Sevilay, Hümeyra]

        //Hasan ile Hümeyra nın yerlerini değiştirelim
        //Büyük bir listede index bilmeden yapalım

        int ilkIndex=isimler.indexOf("Hasan");
        int ikinciIndex=isimler.indexOf("Hümeyra");

        String ilkIsim="Hasan";
        String ikinciIsim="Hümeyra";
        System.out.println(ilkIndex+" "+ikinciIndex);//2 4
        String temp="";
        temp=ilkIsim;
        isimler.set(2,ikinciIsim);
        isimler.set(4,temp);
        System.out.println(isimler);
    }
}
