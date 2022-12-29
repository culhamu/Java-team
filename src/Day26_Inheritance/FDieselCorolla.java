package Day26_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class FDieselCorolla extends ECorolla{

    String motor="1.6 diesel motor";
    String yakit="Diesel";
    String gubenlik="abs";
    String renk="Renk belirtilmedi";

    public static void main(String[] args) {
        //bazen child class tan obje oluşturmakla bereaber bu
        // child class ın parent classında ki hangi özellikleri aldığını bilmek isteriz.
        // bu durumda data türünü construtor ı kullanılan class ın parent class larından
        //seçebiliriz
        //

        DToyota corolla3=new FDieselCorolla();

        System.out.println(corolla3.motor);//T motor belirtilmedi
        System.out.println(corolla3.yakit);//T yakit belirtilmedi
        //System.out.println(corolla3.gubenlik);//CTE
        //System.out.println(corolla3.renk);//CTE

        System.out.println(corolla3.model);//T model belirtilmedi
        //System.out.println(corolla3.uretimYeri);//CTE
        //System.out.println(corolla3.teker);//CTE
        //System.out.println(corolla3.vites);//CTE

        System.out.println(corolla3.marka);//T toyota

        ECorolla corolla2=new FDieselCorolla();

        System.out.println(corolla2.motor);//T
        System.out.println(corolla2.yakit);//T
       // System.out.println(corolla2.gubenlik);//Cte
        //System.out.println(corolla2.renk);//Cte

        System.out.println(corolla2.model);//C
        System.out.println(corolla2.uretimYeri);//C
        System.out.println(corolla2.teker);//c
        System.out.println(corolla2.vites);//C

        System.out.println(corolla2.marka);//t


        FDieselCorolla corolla1=new FDieselCorolla();

        System.out.println(corolla1.motor);//DC
        System.out.println(corolla1.yakit);//DC
        System.out.println(corolla1.gubenlik);//DC
        System.out.println(corolla1.renk);//DC

        System.out.println(corolla1.model);//C
        System.out.println(corolla1.uretimYeri);//C
        System.out.println(corolla1.teker);//c
        System.out.println(corolla1.vites);//C

        System.out.println(corolla1.marka);//t


        //

        List<String> list=new ArrayList<>();
    }
}
