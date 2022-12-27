package Day11_forLoop;

public class C04_forLoop {
    public static void main(String[] args) {
        //eğer şart i nin hiçbir değeri için true oluyorsa
        //input olarak verilen sayıdan 1 e kadar olan sayıları yazdırın
        int input=-23;
        if (input>1){
            for (int i=input;i>=1;i--){
            System.out.println(i+" ");}
        }else {
            for (int i=input;i<=1;i++){
            System.out.println(i+" ");}
        }
    }
}
