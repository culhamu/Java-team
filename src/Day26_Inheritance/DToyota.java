package Day26_Inheritance;

public class DToyota {
    /*
    Bir objenin data türü cons olarak kullanılan class veya o class ın parent class ları olabilir
    Data türü olarak parent class seçilmesinde ki amaç child class tan oluşturulan objenin
    parent class ın tum child class larının taşıdığı ortak özellikleri vurgulamaktadır.
    (personel toplantısına katılan doktor kemal,Başhemşire ayse gibi)
    data türü ve constructor farklı olduğundan variable ile methodlar farklı davranırlar
    variable nin alacağı değeri bulmak için
    aramaya data türü olan class dan başlarız
    o class da yoksa parent larına bakarız

    data türü olan class veya parent larında bulunamazsa CTE olur
     */
    String marka="Toyota";
    String model="Model belirtilmedi";
    String motor="Motor belirtilmedi";
    String yakit="Yakit belirtilmedi";
}
