package com.randomix;

import java.security.SecureRandom;

/**
 *
 * @author yasin.albakir
 */
public class ParolaUret {

    private static final String BUYUK_HARFLER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String KUCUK_HARFLER = "abcdefghijklmnopqrstuvwxyz";
    private static final String RAKAMLAR = "0123456789";
    private static final String OZEL_KARAKTERLER = "!?.";

    private static final String KARAKTER_SETI
            = BUYUK_HARFLER + KUCUK_HARFLER + RAKAMLAR + OZEL_KARAKTERLER;

    private static final SecureRandom RANDOM = new SecureRandom();

    /**
     * �stenilen uzunlukta rastgele parola �retir.
     *
     * @param uzunluk Parola uzunlu�u (en az 4 �nerilir)
     * @return Rastgele parola
     */
    public static String generate(int uzunluk) {
        if (uzunluk < 4) {
            throw new IllegalArgumentException("Parola uzunlu�u en az 4 olmal�d�r!");
        }
        StringBuilder parola = new StringBuilder(uzunluk);

        // Zorunlu olarak en az birer tane karakter eklensin (g��l� parola i�in)
        parola.append(BUYUK_HARFLER.charAt(RANDOM.nextInt(BUYUK_HARFLER.length())));
        parola.append(KUCUK_HARFLER.charAt(RANDOM.nextInt(KUCUK_HARFLER.length())));
        parola.append(RAKAMLAR.charAt(RANDOM.nextInt(RAKAMLAR.length())));
        parola.append(OZEL_KARAKTERLER.charAt(RANDOM.nextInt(OZEL_KARAKTERLER.length())));

        // Kalan karakterleri kar���k setten tamamla
        for (int i = 4; i < uzunluk; i++) {
            parola.append(KARAKTER_SETI.charAt(RANDOM.nextInt(KARAKTER_SETI.length())));
        }

        // Karakterlerin yerini kar��t�ral�m (shuffle)
        char[] parolaArray = parola.toString().toCharArray();
        for (int i = parolaArray.length - 1; i > 0; i--) {
            int j = RANDOM.nextInt(i + 1);
            char tmp = parolaArray[i];
            parolaArray[i] = parolaArray[j];
            parolaArray[j] = tmp;
        }

        return new String(parolaArray);
    }

}
