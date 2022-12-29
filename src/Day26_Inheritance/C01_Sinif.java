package Day26_Inheritance;


class Okul{

    String okulIsmi="Yıldız Koleji";
    String telefon="3123456543";
}

public class C01_Sinif extends Okul {
    String sinif="11-C";
    String telefon="3122343434";

    C01_Sinif(String telefon){
        System.out.println(telefon);
        System.out.println(this.telefon);
        System.out.println(super.telefon);

        System.out.println(okulIsmi);
        System.out.println(this.okulIsmi);
        System.out.println(super.okulIsmi);

        System.out.println(sinif);
        System.out.println(this.sinif);
       // System.out.println(super.sinif);
        // java da parent da bulamadığını gidip childe sorayım olmaz
        //parent class da aranan sınıf variablesi olmadığından cte verir
    }

    public static void main(String[] args) {

        C01_Sinif obj=new C01_Sinif("4222345245");

    }
}
