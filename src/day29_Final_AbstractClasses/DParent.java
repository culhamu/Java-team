package day29_Final_AbstractClasses;

public abstract class DParent {
    /*Chil class ların tamamında method1 ve method2 nin mutlaka kullanılmasını istiyoruz
    java parent class daki istenen methodları child class da ki methodları override etmesi
    zorunda kalması için java ABSTRACT CLASS ı oluşturmuştur

    bir class ı abstract yapmak istersek class deklerasyonuna abstract yazmamız yeterlidir

    Bir abstaract class ın için de child class ların override etmesi mecburi olan methodlar olabileceği gibi
    mecburi olmayan methodlarda olabilir

    child class ların mutlaka override edeceği methodlar abstract ederiz

    abstract yapılan tüm methodlar child class ların tamamında override edileceğinden
    parent class daki abstract method un body sine ihtiyacı olmaz

    Abstract methodların body si olmaz

    Abstract class larda abstract methodlar bulunduğu için abstract cass lardan obje üretilemez
     */
    public abstract void method1();


    public abstract void method2();

    public void method3(){
        System.out.println("Parent class daki method 3 çalıştı");
    }
}
