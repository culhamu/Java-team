package day15_scopeArrays;

public class C02_hastahane {
    static String hastaneIsmi="Yildiz hastanesi";
    static String hastaneAdresi="Çankaya/Ankara";
    String personelIsmi="personel";
    String personelAdresi="Adres";
    String PersonelTel="telefon";

    public static void main(String[] args) {
        C02_hastahane per1=new C02_hastahane();

        C02_hastahane per2=new C02_hastahane();

        per1.personelIsmi="Harun";

        per2.personelAdresi="Çankaya";
    }
}




