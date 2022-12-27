package Day17_arrays;

public class C06_MDA {
    public static void main(String[] args) {
        //verilen 2 katlı string bir array de istenen elementleri yazdıran bir method oluşturun
        String [][] arr={{"ali","zafer"},{"maho","gülo"},{"fatma"}};
        String arananMetin="e";
        istenenElementleriYazdır(arr,arananMetin);
    }public static void istenenElementleriYazdır(String[][]arr,String arananMetin){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j].contains(arananMetin)){
                    System.out.print(arr[i][j]+" ");
                }



            }
            System.out.println("");

        }

    }
}
