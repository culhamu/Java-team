package day07_ternary_Switch_Statements;

public class C03_ternary {
    public static void main(String[] args) {

        int input=45;
        if (input<=100) {input*=2;}
        else System.out.println(input+=10);
        input=46;
        System.out.println(input>100 ? "büyük sayı" : input+10);
    }
}
