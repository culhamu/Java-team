package Day11_forLoop;

public class C09_nestedLoop {
    public static void main(String[] args) {

        /*
        input olarak verilen kenar uzunluklarına göre aşağıdaki şekli çizdirin
         */
        int kisaKenar=5;
        int uzunKenar=8;

        for (int i = 1; i <=kisaKenar; i++) {
            for (int j = 1; j <=uzunKenar ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
