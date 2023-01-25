package day15_scopeArrays;

public class C01_scope {

        static String hastaneIsmi="Yildiz hastanesi";
        static String hastaneAdresi="Çankaya/Ankara";
        String personelIsmi;
        String personelAdresi;
        String PersonelTel;
        public static void main(String[] args) {

           C01_scope per1=new C01_scope();
            System.out.println(per1.personelAdresi);//null döndürür
            per1.personelAdresi="Germany";
            per1.personelIsmi="Fidan";
            per1.PersonelTel="05467894512";
            per1.hastaneIsmi="Java hastahanesi";
            System.out.println(hastaneIsmi);

    }public  static  void method1(){
        System.out.println(hastaneIsmi);
    }public void method2(){
        System.out.println(hastaneIsmi);
    }
}
