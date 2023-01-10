package day25_Inheritance;

public class DToyota extends CCar {
    DToyota(){

        System.out.println("Parametresiz Toyota Constructoru çalıştı");
    }
    DToyota(String renk){
        System.out.println("Parametreli toyota cons çalıştı ");
    }
    String marka="Toyota";
    String uretimYeri="Toyota farklı ülkelerde üreetilir";
}
