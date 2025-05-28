
import com.randomix.Randomix;

/**
 *
 * @author yasin.albakir
 */
public class RandomixTest {

    public static void main(String[] args) {
        String ad = Randomix.ad();
        String soyad = Randomix.soyad();
        String sehir = Randomix.sehir();
        String ilce = Randomix.ilce(sehir);
        String tckn = Randomix.tckn();
        String vgn = Randomix.vgn();
        String parola = Randomix.parola(10);
        String mail = Randomix.mail(ad, soyad);

        System.out.println("TCKN: " + tckn);
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Ýl: " + sehir);
        System.out.println("Ýlçe: " + ilce);
        System.out.println("VGN: " + vgn);
        System.out.println("Parola: " + parola);
        System.out.println("E-Posta: " + mail);

    }

}
