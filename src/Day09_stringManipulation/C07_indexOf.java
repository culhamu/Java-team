package Day09_stringManipulation;

import java.util.Scanner;

public class C07_indexOf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String girilenCumle=scan.nextLine();

        if (!girilenCumle.contains("çok")){

            System.out.println("Cumlede çok ile baslayan kelime yok");
        }else{

            int cokIndexi=girilenCumle.indexOf("çok");
            int boslukIndexi=girilenCumle.indexOf(" ",cokIndexi+1);

            System.out.println(girilenCumle.substring(cokIndexi, boslukIndexi));
        }


    }
}
