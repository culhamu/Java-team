package Day24_StringBuilder;

import Day25_Inheritance.APersonel;

public class FChildOfPersonel extends APersonel {
    public static void main(String[] args) {

        FChildOfPersonel obj1=new FChildOfPersonel();

        System.out.println(obj1.isim);
        //obj1.privateMethod(); child class dahi olsa da private modifiere ulaşamaz

    }
}
