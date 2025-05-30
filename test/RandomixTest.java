
import com.randomix.Randomix;

/**
 *
 * @author yasin.albakir
 */
public class RandomixTest {

    public static void main(String[] args) {
        String adErkek = Randomix.ad().erkek();
        String adKadin = Randomix.ad().kadin();
        String adRastgele = Randomix.ad().rastgele();
        String soyad = Randomix.soyad();
        String tamAd = Randomix.ad().tamAd();
        String babaAdi = Randomix.ad().babaAdi();
        String anneAdi = Randomix.ad().anneAdi();
        String sehir = Randomix.sehir();
        String ilce = Randomix.ilce(sehir);
        String tckn = Randomix.tckn();
        String vgn = Randomix.vgn();
        String parola = Randomix.parola(10);
        String mail = Randomix.mail(adErkek, soyad);
        String mail2 = Randomix.mail();
        String cep = Randomix.telefon().cep();
        String ev = Randomix.telefon().ev();
        String kullaniciAdi1 = Randomix.kullaniciAdi();
        String kullaniciAdi2 = Randomix.kullaniciAdi(adErkek, soyad);
        String dogumTarih1 = Randomix.dogumTarihi();
        String dogumTarih2 = Randomix.dogumTarihi(20, 50);
        String bugunTarih = Randomix.bugunTarih();
        String bugunSaat = Randomix.bugunSaat();
        String BugunTarihSaat = Randomix.bugunTarihSaat();
        int sayi = Randomix.sayi(0, 10);
        String sirketAdi = Randomix.sirketAdi();
        String kanGrubu = Randomix.kanGrubu();
        String adres = Randomix.adres();
        String cinsiyet = Randomix.cinsiyet();
        String medeniHal = Randomix.medeniHal();
        String din = Randomix.din();

        System.out.println("TCKN: " + tckn);
        System.out.println("Erkek Adý: " + adErkek);
        System.out.println("Kadýn Adý: " + adKadin);
        System.out.println("Rastgele Ad: " + adRastgele);
        System.out.println("Baba Adý: " + babaAdi);
        System.out.println("Anne Adý: " + anneAdi);
        System.out.println("Soyad: " + soyad);
        System.out.println("Tam Ad: " + tamAd);
        System.out.println("Ýl: " + sehir);
        System.out.println("Ýlçe: " + ilce);
        System.out.println("VGN: " + vgn);
        System.out.println("Parola: " + parola);
        System.out.println("E-Posta1: " + mail);
        System.out.println("E-Posta2: " + mail2);
        System.out.println("Cep Tel: " + cep);
        System.out.println("Ev Tel: " + ev);
        System.out.println("Kullanýcý Adý 1: " + kullaniciAdi1);
        System.out.println("Kullanýcý Adý 2: " + kullaniciAdi2);
        System.out.println("Doðum Tarihi1: " + dogumTarih1);
        System.out.println("Doðum Tarihi2: " + dogumTarih2);
        System.out.println("Bugünün Tarihi: " + bugunTarih);
        System.out.println("Bugünün Saati: " + bugunSaat);
        System.out.println("Bugünün Tarih ve Saati: " + BugunTarihSaat);
        System.out.println("Üretilen Sayý: " + sayi);
        System.out.println("Þirket Adý: " + sirketAdi);
        System.out.println("Kan Grubu: " + kanGrubu);
        System.out.println("Adres: " + adres);
        System.out.println("Cinsiyet: " + cinsiyet);
        System.out.println("Medeni Hal: " + medeniHal);
        System.out.println("Din: " + din);

    }

}
