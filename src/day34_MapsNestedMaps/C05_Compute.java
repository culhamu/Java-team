package day34_MapsNestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C05_Compute {
    public static void main(String[] args) {
        Map<String,Integer> harfsayilariMap=new TreeMap<>();

        harfsayilariMap.put("A",10);
        harfsayilariMap.put("C",15);
        harfsayilariMap.put("D",3);
        harfsayilariMap.put("K",5);

        System.out.println(harfsayilariMap);//{A=10, C=15, D=3, K=5}

        //A'nin kullanım miktarını 20 yapın

        harfsayilariMap.put("A",20);

        //C'nin kullanım mikrarını 2 katına çıkar
        harfsayilariMap.put("C",harfsayilariMap.get("C")*2);

        System.out.println(harfsayilariMap);//{A=20, C=30, D=3, K=5}

        //D'nin miktaını 5 artıralım
        harfsayilariMap.compute("D",(k,v)->v+5);
        System.out.println(harfsayilariMap);//{A=20, C=30, D=8, K=5}

        //eğer map te T varsa kullanım miktarını 3 eksiltin
        harfsayilariMap.computeIfPresent("T",(k,v)->v-3);
        System.out.println(harfsayilariMap);//{A=20, C=30, D=8, K=5}

        //K harfi varsa kullanımı 2 azaltın
        harfsayilariMap.computeIfPresent("K",(k,v)->v-2);
        System.out.println(harfsayilariMap);//{A=20, C=30, D=8, K=3}

        //T harfi yoksa kullanım miktari 3 olarak ekleyin
        harfsayilariMap.computeIfAbsent("T",v->3);
        System.out.println(harfsayilariMap);//{A=20, C=30, D=8, K=3, T=3}



    }
}
