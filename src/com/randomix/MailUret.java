package com.randomix;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class MailUret {

    private static final List<String> DOMAINLER = Arrays.asList(
            "gmail.com", "outlook.com", "yahoo.com", "hotmail.com"
    );

    private static final Random RANDOM = new Random();

    /**
     * Dýþarýdan ad ve soyad alýr, ad.soyad@domain þeklinde e-posta üretir.
     */
    public static String generate(String ad, String soyad) {
        String domain = DOMAINLER.get(RANDOM.nextInt(DOMAINLER.size()));
        // Türkçe karakterleri dönüþtür ve hepsini küçük harfe çevir
        String email = temizle(ad) + "." + temizle(soyad) + "@" + domain;
        return email.toLowerCase(Locale.ROOT);
    }

    /**
     * Havuzdan rastgele ad ve soyad seçerek e-posta üretir.
     */
    public static String generate() {
        String ad = VeriSetleri.ADLAR_ERKEK.get(RANDOM.nextInt(VeriSetleri.ADLAR_ERKEK.size()));
        String soyad = VeriSetleri.SOYADLAR.get(RANDOM.nextInt(VeriSetleri.SOYADLAR.size()));
        return generate(ad, soyad);
    }

    // Türkçe karakterleri ingilizceye çeviren yardýmcý metot
    private static String temizle(String input) {
        return input
                .replace("ç", "c")
                .replace("Ç", "c")
                .replace("ð", "g")
                .replace("Ð", "g")
                .replace("ý", "i")
                .replace("Ý", "i")
                .replace("ö", "o")
                .replace("Ö", "o")
                .replace("þ", "s")
                .replace("Þ", "s")
                .replace("ü", "u")
                .replace("Ü", "u")
                .replaceAll("[^a-zA-Z]", ""); // Harf dýþý karakterleri temizle
    }

}
