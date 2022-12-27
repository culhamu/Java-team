package Day10_stringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str="Ja1va 56Gu9z,ze3l-di6r";
             str=str.replaceAll("\\d","");
             str=str.replaceAll("\\s","");
             str=str.replaceAll("\\W","");
        System.out.println(str);


    }
}
