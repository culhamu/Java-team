package Day11_forLoop;

public class C08_nestedForlop {
    public static void main(String[] args) {
        //verilen inputa göre çarpım tapolosu oluşturun
        int input=4;
        for (int i = 1; i <= 4; i++) {
            System.out.print(i+" ");

        }
        System.out.println("");
        for (int i = 1; i <= 4; i++) {
            System.out.print(2*i+" ");

        }
        System.out.print("");
        for (int i = 1; i <= 4; i++) {
            System.out.print(3*i+" ");

        }
        System.out.println("");
            for (int i = 1; i <= 4; i++) {
            System.out.print(4*i+" ");
                System.out.println("");

        }
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println("");
        }
    }
}
