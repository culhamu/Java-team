package Day25_Inheritance;

public class ECorolla extends DToyota {
    ECorolla(){
        System.out.println("Parametresiz Corolla Constructoru çalıştı");
    }
    ECorolla(String param1){
        super("Gri");
        System.out.println("Parametereli cons çalıştı");
    }
    String model="Corolla";
    String uretimYeri="Türkiye";

    public static void main(String[] args) {
        ECorolla cor1=new ECorolla("Mavi");
    }
    /*
    bir obje oluşturulduğunda ilk değer ataması yapılabilmesi için constructor çalışmalıdır
    inharitance de biliyoruz ki child class tan oluşturulan her obje parent class daki her özelliğe sahip olur
    parent class daki her özelliğe sahip olabilmesi için parent class daki constructor da çalışmalıdır

    java bu çalışmayı super() constructor call sayesinde sağlar

    Java da her oluşturulan class da görülmesede default constructor olması gibi
    extends keywords oluşturulan her class da görülmeyen super() vardır
    */
}
