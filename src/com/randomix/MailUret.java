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
     * D��ar�dan ad ve soyad al�r, ad.soyad@domain �eklinde e-posta �retir.
     */
    public static String generate(String ad, String soyad) {
        String domain = DOMAINLER.get(RANDOM.nextInt(DOMAINLER.size()));
        // T�rk�e karakterleri d�n��t�r ve hepsini k���k harfe �evir
        String email = temizle(ad) + "." + temizle(soyad) + "@" + domain;
        return email.toLowerCase(Locale.ROOT);
    }

    /**
     * Havuzdan rastgele ad ve soyad se�erek e-posta �retir.
     */
    public static String generate() {
        String ad = VeriSetleri.ADLAR_ERKEK.get(RANDOM.nextInt(VeriSetleri.ADLAR_ERKEK.size()));
        String soyad = VeriSetleri.SOYADLAR.get(RANDOM.nextInt(VeriSetleri.SOYADLAR.size()));
        return generate(ad, soyad);
    }

    // T�rk�e karakterleri ingilizceye �eviren yard�mc� metot
    private static String temizle(String input) {
        return input
                .replace("�", "c")
                .replace("�", "c")
                .replace("�", "g")
                .replace("�", "g")
                .replace("�", "i")
                .replace("�", "i")
                .replace("�", "o")
                .replace("�", "o")
                .replace("�", "s")
                .replace("�", "s")
                .replace("�", "u")
                .replace("�", "u")
                .replaceAll("[^a-zA-Z]", ""); // Harf d��� karakterleri temizle
    }

}
