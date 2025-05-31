package com.randomix;

import java.util.Random;

public class PasaportNoUret {
    private static final Random RANDOM = new Random();

    /**
     * Türkiye pasaport formatında (1 harf + 8 rakam) pasaport no üretir.
     * Örn: U12345678
     */
    public static String generate() {
        // İstediğin harflerden birini rastgele seç (sıklıkla U veya Z kullanılır)
        String harfler = "UZMN";
        char harf = harfler.charAt(RANDOM.nextInt(harfler.length()));

        // 8 haneli sayı üret
        int num = 10000000 + RANDOM.nextInt(90000000); // 10000000 - 99999999
        return harf + String.valueOf(num);
    }
}
