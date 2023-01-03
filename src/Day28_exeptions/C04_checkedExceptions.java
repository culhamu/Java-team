package Day28_exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_checkedExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis=new FileInputStream("src/Day28_exeptions/Metin.txt");
        /*
        bazı kodları yazdığımızda java compile time sırasında o kodlarda exception rislini görür
        ve bizden bir çözüm bekler.Özellikle dosya okuma ve yazma ile ilgili io(input output)
        işlemlerinde java ya okuyamazsam ya yazamazsam diye bizden compile time de yardım ister
        bu durumda biz exceptionla karşılaşıldığında kod dursun diyorsak method satırına throws
        keyword kullanarak beklenilen exceptions ları deklare edebiliriz
        bu sadece olayın farkında olduğumuzu deklare eder exception ya da durdurmanın önüne geçmez
        kod çalışmaya devam etsin: try/catch ya da try/catch/finally bloğu kullanırız
         */
    }
}
