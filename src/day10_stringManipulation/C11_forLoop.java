package day10_stringManipulation;

public class C11_forLoop {
    public static void main(String[] args) {

        //Verilen sayının faktöriyelin hesaplayın
        int input=13;
        int carpim=1;
        for (int i=1;i<=input;i++){
        carpim*=input;}
        System.out.println("verilen"+input+"carpim:"+carpim);
    }
}
