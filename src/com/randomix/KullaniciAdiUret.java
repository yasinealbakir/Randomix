package com.randomix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class KullaniciAdiUret {

    private static final Random RANDOM = new Random();

    private static final List<String> tumAdlar;

    static {
        tumAdlar = new ArrayList<>();
        tumAdlar.addAll(VeriSetleri.ADLAR_ERKEK);
        tumAdlar.addAll(VeriSetleri.ADLAR_KADIN);
    }

    // Kullan�labilecek kullan�c� ad� formatlar�
    private static final List<String> FORMATLAR = Arrays.asList(
            "{ad}.{soyad}", // ahmet.demir
            "{ad}_{soyad}", // ahmet_demir
            "{ad}{soyad}", // ahmetdemir
            "{ad}{sayi}", // ahmet48
            "{soyad}{ad}", // demirahmet
            "{soyad}_{ad}", // demir_ahmet
            "{ad}.{soyad}{sayi}", // ahmet.demir42
            "{ad}{soyad}{sayi}", // ahmetdemir81
            "{ad_ilk}.{soyad}", // a.demir
            "{ad_ilk}{soyad}", // ademir
            "{ad}.{soyad_ilk}" // ahmet.d
    // Daha fazla format kolayca eklenebilir
    );

    // T�rk�e karakter temizleme fonksiyonu
    private static String temizle(String s) {
        return s
                .replace("�", "c").replace("�", "c")
                .replace("�", "g").replace("�", "g")
                .replace("�", "i").replace("�", "i")
                .replace("�", "o").replace("�", "o")
                .replace("�", "s").replace("�", "s")
                .replace("�", "u").replace("�", "u")
                .replaceAll("[^a-zA-Z0-9]", "");
    }

    /**
     * D��ar�dan verilen ad ve soyad ile �e�itli formatlarda kullan�c� ad�
     * �retir.
     */
    public static String generate(String ad, String soyad) {
        String format = FORMATLAR.get(RANDOM.nextInt(FORMATLAR.size()));

        String adTemiz = temizle(ad).toLowerCase(Locale.ROOT);
        String soyadTemiz = temizle(soyad).toLowerCase(Locale.ROOT);

        String adIlk = adTemiz.length() > 0 ? adTemiz.substring(0, 1) : "";
        String soyadIlk = soyadTemiz.length() > 0 ? soyadTemiz.substring(0, 1) : "";
        int sayi = 10 + RANDOM.nextInt(90); // 10-99 aras� bir say�

        return format
                .replace("{ad}", adTemiz)
                .replace("{soyad}", soyadTemiz)
                .replace("{ad_ilk}", adIlk)
                .replace("{soyad_ilk}", soyadIlk)
                .replace("{sayi}", String.valueOf(sayi));
    }

    /**
     * Havuzdan rastgele ad ve soyad se�erek �e�itli formatlarda kullan�c� ad�
     * �retir.
     */
    public static String generate() {
        String ad = tumAdlar.get(RANDOM.nextInt(tumAdlar.size()));
        String soyad = VeriSetleri.SOYADLAR.get(RANDOM.nextInt(VeriSetleri.SOYADLAR.size()));
        return generate(ad, soyad);
    }

}
