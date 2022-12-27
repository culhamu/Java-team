package Day24_StringBuilder;

public class Encapsulation {
    private int satis;// satış bölümünden değer girilebilsin ama değeri görünemesin
     private int rapor=100;//görülebilsin ama değiştirilemesin

    public int getHalkaAcikSayi() {
        return halkaAcikSayi;
    }

    public void setHalkaAcikSayi(int halkaAcikSayi) {
        this.halkaAcikSayi = halkaAcikSayi;
    }

    public static int getToplamSatis() {
        return toplamSatis;
    }

    public void setSatis(int satis) {
        this.satis = satis;
        toplamSatis+=this.satis;
    }
static int toplamSatis=0;
    private  int halkaAcikSayi=10;//herkese açık olsun
}
