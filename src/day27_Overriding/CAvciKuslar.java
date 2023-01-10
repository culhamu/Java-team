package day27_Overriding;

public class CAvciKuslar extends BKuslar {
    protected void hareket( ){
        System.out.println("ucarlar");
    }
    protected void beslenme( ) {
        System.out.println(" et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelidir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {
        CAvciKuslar kartal1=new CAvciKuslar();
        kartal1.hareket();//C bulunduğu class tan gelir ucarlar
        kartal1.beslenme();// C classın dan gelir  et yerler
        kartal1.pence();//C pencelidir
        kartal1.gaga();//C sivri gagali

        kartal1.kanat();//B classından çalışır kanatlidirlar
        kartal1.solunum();//B akcigerle nefes alirlar
        kartal1.cogalma();//B //yumurtayla cogalirlar

        kartal1.omur();//A classından çalışır// yasar ve olurler

        //eğer cons ile data type ynı ise özelliğin variable veya method olmasına bakılmaksızın
        //o class a gidilir o class veya parent class larda bulunan ilk değer kullanılır

        BKuslar kartal2=new CAvciKuslar();

        kartal2.hareket();//C bulunduğu class tan gelir ucarlar
        kartal2.beslenme();// C classın dan gelir  et yerler
        //kartal2.pence();//BKuslar veya parent class ta yok o tüzden CTE
        kartal2.gaga();//C sivri gagali

        kartal2.kanat();//B classından çalışır kanatlidirlar
        kartal2.solunum();//B akcigerle nefes alirlar
        kartal2.cogalma();//B //yumurtayla cogalirlar

        kartal2.omur();//A classından çalışır// yasar ve olurler

        //en güncel bilgileri methodla öğreniriz ama variable de böyle değildir

        AHayvanlar kartal3=new CAvciKuslar();


        kartal3.hareket();//C bulunduğu class tan gelir ucarlar
        kartal3.beslenme();// C classın dan gelir  et yerler
        //kartal3.pence();// AHayvanlarda yok CTE
        //kartal3.gaga();//AHayvanlarda yok CTE

       // kartal3.kanat();//AHayvanlarda yok CTE
        kartal3.solunum();//B akcigerle nefes alirlar
        kartal3.cogalma();//B //yumurtayla cogalirlar

        kartal3.omur();//A classından çalışır// yasar ve olurler

        //overriding=update
        //methodlar dinamik özelliklidir ama variable ise statik özelliklidir
    }

}
