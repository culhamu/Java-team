package Day07_ternary_Switch_Statements;

public class C08_nestedTernary {
    public static void main(String[] args) {

        int sayi=23;
        System.out.println(sayi>0 ?
                                    sayi%2==0 ? "Çift sayı" : "tek sayi" :
                                    sayi<=-100 && sayi>=-999 ? "3 basamaklı" : "3 basamaklı değil");
    }
}
