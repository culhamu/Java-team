package Day28_exeptions;

import java.util.Scanner;

public class C05_multipleExceptions {
    public static void main(String[] args) {
        /*
        Kulllanıcıdan bir tam saı alın girilen sayıyı index olarak kullanıp str ve arr den o indexdeki elementi yazdırın
         */
        String str="Java da çok fazla exceptions var";
        int[] arr={3,5,1,2,3,6,1,2,8,2};
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir index girin");
        int index=scan.nextInt();
       // System.out.println("String deki istenen element"+str.substring(index,index+1));
        //System.out.println("array deki istenen element "+arr[index]);

        //eğer birden fazla exc oluşma ihtimali varsa
        //bu exc birbirinden bağımsız ise
        //1 tek try istenen kadar catch yapılabilir
        //2 ikisi için iç içe try catch yapılabilir
        //3 ikisini de kapsayan try catch yapılabilir

        /*1. çözüm
        try {
            System.out.println("String deki istenen element"+str.substring(index,index+1));
            System.out.println("array deki istenen element "+arr[index]);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("istenen index str ın sınırları dışında");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("İsrenen index teki element arrayin dışında");

         */
        //2. çözüm içiçe try catch
        /*
        try {
            try {
                System.out.println("String deki istenen element"+str.substring(index,index+1));
                System.out.println("array deki istenen element "+arr[index]);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("istenen index str ın sınırları dışında");

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("İsrenen index teki element arrayin dışında");
        }

         */
        //3. çözüm tek ama daha kapsamlı exc kullanma

        try {
            System.out.println("String deki istenen element"+str.substring(index,index+1));
            System.out.println("array deki istenen element "+arr[index]);
        }catch (RuntimeException e){
            System.out.println("index string ve/veya array in sınırları dışında");
            e.printStackTrace();
        }


    }
    }

