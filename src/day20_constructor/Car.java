package day20_constructor;

public class Car {
    /*
    bir class dan oluşturulabilecek objelerin özelliklerini
    variable veya methodlearla oluşturabiliriz
     */
    String marka="Model belirtilmemiş";
    String model="Model belirtilmemiş";
    int yil=1900;
    int km;
    String renk="Renk belirtilmemiş";
    public Car(){}

    public Car(String marka, String model, int yil, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.renk = renk;
    }

    public Car(String mrk, String mdl, int kmetre, int yl, String rnk) {
        marka=mrk;
        model=mdl;
        km=kmetre;
        yil=yl;
        renk=rnk;

    }

    public Car(String marka, String model, int yil) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;
    }
/*
bir class da görünür bir constructor oluşturduğumuz da java default constructoru siler
bu durumda default constructoru kullanarak obje oluşturan class larda cte oluşur
bunu önlemek için biz herhangi bir parametresiz construcror oluştururuz
 */

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", km=" + km +
                ", renk='" + renk + '\'' +
                '}';
    }

    public static void hareket(){
        System.out.println("tüm arabalar hareket eder");
    }


}
