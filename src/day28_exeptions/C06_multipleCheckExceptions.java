package day28_exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_multipleCheckExceptions {
    public static void main(String[] args) {
        //metin txt dosyasındaki içeriği yazdıralım

        /*
        eğer birden fazla catch cümlemiz varsa ve exc lar arasında parent child ilişkisi varsa
        1 ikisini de yazmak istiyorsak önce child exc sonra parent exc yazılmalıdır
        aksi durumda parent exc üste olursa tüm hepsini yakalayacağı için anlamsız olur
        2 sadece birini yazcaksak parent exc yazmalıyız çünkü daha kapsamlısır ve daha çok
        exc yakalar
         */
        try {
            FileInputStream fis=new FileInputStream("src/Day28_exeptions/Metin.txt");
            int k=0;
            while ((k=fis.read())!=-1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
