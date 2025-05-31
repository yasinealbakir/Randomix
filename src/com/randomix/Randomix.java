package com.randomix;

/**
 * @author yasin.albakir
 */
public class Randomix {

    public static AdUret ad() {
        return new AdUret();
    }

    public static String soyad() {
        return SoyadUret.generate();
    }

    public static String sehir() {
        return SehirUret.generate();
    }

    public static String ilce(String sehir) {
        return IlceUret.generate(sehir);
    }

    public static String tckn() {
        return TcknUret.generate();
    }

    public static String vgn() {
        return VgnUret.generate();
    }

    public static String parola(int uzunluk) {
        return ParolaUret.generate(uzunluk);
    }

    public static String mail(String ad, String soyad) {
        return MailUret.generate(ad, soyad);
    }

    public static String mail() {
        return MailUret.generate();
    }

    public static TelefonNoUret telefon() {
        return new TelefonNoUret();
    }

    public static String kullaniciAdi() {
        return KullaniciAdiUret.generate();
    }

    public static String kullaniciAdi(String ad, String soyad) {
        return KullaniciAdiUret.generate(ad, soyad);
    }

    public static String dogumTarihi() {
        return TarihUret.dogumTarihi();
    }

    public static String dogumTarihi(int min, int max) {
        return TarihUret.dogumTarihi(min, max);
    }

    public static String bugunTarih() {
        return TarihUret.bugunTarih();
    }

    public static String bugunSaat() {
        return TarihUret.bugunSaat();
    }

    public static String bugunTarihSaat() {
        return TarihUret.bugunTarihSaat();
    }

    public static int sayi(int min, int max) {
        return SayiUret.generate(min, max);
    }

    public static String sirketAdi() {
        return SirketAdiUret.generate();
    }

    public static String kanGrubu() {
        return KanGrubuUret.generate();
    }

    public static String adres() {
        return AdresUret.generate();
    }

    public static String cinsiyet() {
        return CinsiyetUret.generate();
    }

    public static String medeniHal() {
        return MedeniHalUret.generate();
    }

    public static String din() {
        return DinUret.generate();
    }

    public static String ulke() {
        return UlkeUret.generate();
    }

    public static String uyruk() {
        return UyrukUret.generate();
    }

    public static String ip() {
        return IpUret.generate();
    }

    public static String postaKodu() {
        return PostaKodUret.generate();
    }

    public static String guid() {
        return GuidUret.generate();
    }

    public static String unvan() {
        return UnvanUret.generate();
    }

    public static String dogumYeri() {
        return DogumYeriUret.generate();
    }

    public static String pasaportNo() {
        return PasaportNoUret.generate();
    }

    public static String ehliyetNo() {
        return EhliyetNoUret.generate();
    }

    public static String plaka() {
        return PlakaUret.generate();
    }

    public static MetinUret metin() {
        return new MetinUret();
    }

}
