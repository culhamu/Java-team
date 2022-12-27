package Day20_constructor;

import Day19_arrayList_forEachLoop.Toyota;

public class C01_constructor {
    public static void main(String[] args) {
        Car car=new Car();
        Toyota toyota=new Toyota();
        System.out.println(car);
        //Toyota class daki cons. çalıştı
        //Car{marka='Model belirtilmemiş', model='Model belirtilmemiş', yil=1900, km=0, renk='Renk belirtilmemiş'}
        System.out.println(toyota);//Day19_arrayList_forEachLoop.Toyota@30dae81
        //toyota bir obje olduğu için referansını yazdırır
        car.marka="Audi";
        car.model="A8";
        car.yil=2022;
        car.km=2000;
        car.renk="siyah";
        System.out.println(car);

        Car car1=new Car("BMW","5.20",2020,2000,"siyah");

        System.out.println(car1);

        Car car3=new Car("Toyota","Corolla",2006,"kirmizi");
        System.out.println(car3);
    }
}
