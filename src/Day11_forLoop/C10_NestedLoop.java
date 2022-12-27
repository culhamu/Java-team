package Day11_forLoop;

public class C10_NestedLoop {
    public static void main(String[] args) {
        /*


            1           1. satir 1’den 1’e kadar yazdir
            1 2         2. satir 1’den 2’e kadar yazdir
            1 2 3         3. satir 1’den 3’e kadar yazdir
            1 2 3 4.      4. satir 1’den 4’e kadar yazdir
         */
        int input=4;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.println(j+" ");

            }

        }
        System.out.println("");
    }
}
