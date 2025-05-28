
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

        System.out.println("TCKN: " + tckn);
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Ýl: " + sehir);
        System.out.println("Ýlçe: " + ilce);

    }

}
