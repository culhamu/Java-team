package Day07_ternary_Switch_Statements;

public class C07_sorular {
    public static void main(String[] args) {

        int input=54;
        System.out.println(input>=50 ? "Sınıfı geçtin" : "maalesef kaldın");

        char krk='a';
        System.out.println(krk>='a' && krk<='z' ? (char)(krk-32) : krk );

        input=-9;

        System.out.println(input>0 ? input : (-1)*(input) );

    }
}
