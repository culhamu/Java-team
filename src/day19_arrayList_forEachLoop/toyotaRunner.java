package day19_arrayList_forEachLoop;

public class toyotaRunner {
    public static void main(String[] args) {
        Toyota toyota1=new Toyota();
        System.out.println(toyota1.marka+", "
                            +toyota1.model+", "
                            +toyota1.km+", "
                            +toyota1.renk);//Toyota, Model belirtilmemiş, 0, null
        toyota1.model="Corolla";
        toyota1.yil=2022;
        toyota1.km=50000;

        System.out.println(toyota1.marka+", "
                +toyota1.model+", "
                +toyota1.km+", "
                +toyota1.renk);//Toyota, Corolla, 50000, null
    }

}
