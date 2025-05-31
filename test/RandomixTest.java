
import com.randomix.Randomix;

/**
 * @author yasin.albakir
 */
public class RandomixTest {

    public static void main(String[] args) {
        String adErkek = Randomix.ad().erkek();
        String soyad = Randomix.soyad();
        String adKadin = Randomix.ad().kadin();
        String adRastgele = Randomix.ad().rastgele();
        String tamAd = Randomix.ad().tamAd();
        String babaAdi = Randomix.ad().babaAdi();
        String anneAdi = Randomix.ad().anneAdi();
        String sehir = Randomix.sehir();
        String ilce = Randomix.ilce(sehir);
        String tckn = Randomix.tckn();
        String vgn = Randomix.vgn();
        String parola = Randomix.parola(6);
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
        String ulke = Randomix.ulke();
        String uyruk = Randomix.uyruk();
        String ip = Randomix.ip();
        String postaKodu = Randomix.postaKodu();
        String guid = Randomix.guid();
        String unvan = Randomix.unvan();

        System.out.println("TCKN: " + tckn);
        System.out.println("Erkek Adı: " + adErkek);
        System.out.println("Soyad: " + soyad);
        System.out.println("Kadın Adı: " + adKadin);
        System.out.println("Rastgele Ad: " + adRastgele);
        System.out.println("Baba Adı: " + babaAdi);
        System.out.println("Anne Adı: " + anneAdi);
        System.out.println("Tam Ad: " + tamAd);
        System.out.println("Şehir: " + sehir);
        System.out.println("İlçe: " + ilce);
        System.out.println("VGN: " + vgn);
        System.out.println("Parola: " + parola);
        System.out.println("E-Posta1: " + mail);
        System.out.println("E-Posta2: " + mail2);
        System.out.println("Cep Tel: " + cep);
        System.out.println("Ev Tel: " + ev);
        System.out.println("Kullanıcı Adı 1: " + kullaniciAdi1);
        System.out.println("Kullanıcı Adı 2: " + kullaniciAdi2);
        System.out.println("Doğum Tarihi1: " + dogumTarih1);
        System.out.println("Doğum Tarihi2: " + dogumTarih2);
        System.out.println("Bugünün Tarihi: " + bugunTarih);
        System.out.println("Bugünün Saati: " + bugunSaat);
        System.out.println("Bugünün Tarih ve Saati: " + BugunTarihSaat);
        System.out.println("Üretilen Sayı: " + sayi);
        System.out.println("Şirket Adı: " + sirketAdi);
        System.out.println("Kan Grubu: " + kanGrubu);
        System.out.println("Adres: " + adres);
        System.out.println("Cinsiyet: " + cinsiyet);
        System.out.println("Medeni Hal: " + medeniHal);
        System.out.println("Din: " + din);
        System.out.println("Ülke: " + ulke);
        System.out.println("Uyruk: " + uyruk);
        System.out.println("IP Adresi: " + ip);
        System.out.println("Posta Kodu: " + postaKodu);
        System.out.println("GUID: " + guid);
        System.out.println("Ünvan: " + unvan);

    }

}
