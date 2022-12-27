package Day20_constructor;

public class C02_constructor {
    public static void main(String[] args) {
        /*
        bir obje oluşturulurken idtediğimiz özellikleri direkt atayabilirsek
        sonradan tekrar atama yapmamıza gerek kalmaz

        bu durumda atamayı tek tek  bizim yapmamız yerine constructor un atama yapmasını istemeliyiz


        atama yapmak için constructor a parametre göndermeliyiz
         */

        karesiniYazdir(5);

        Car car2=new Car("tofaş","şahin",2010);

    }





    public static void karesiniYazdir(int sayi){
        System.out.println(sayi*sayi);
    }
}
