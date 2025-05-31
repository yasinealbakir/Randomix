package com.randomix;

import java.util.Random;

public class EhliyetNoUret {

    private static final Random RANDOM = new Random();

    /**
     * Ehliyet no üretir (1-2 harf + 6-7 rakam, ör: B1234567 veya AB123456)
     */
    public static String generate() {
        // 1 ya da 2 harf seç
        String harfler = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int harfUzunlugu = RANDOM.nextBoolean() ? 1 : 2;
        StringBuilder harfKismi = new StringBuilder();
        for (int i = 0; i < harfUzunlugu; i++) {
            harfKismi.append(harfler.charAt(RANDOM.nextInt(harfler.length())));
        }
        // Rakam uzunluğunu harf sayısına göre belirle
        int rakamUzunlugu = harfUzunlugu == 1 ? 7 : 6;
        int min = (int) Math.pow(10, rakamUzunlugu - 1);
        int max = (int) Math.pow(10, rakamUzunlugu) - 1;
        int rakamKismi = min + RANDOM.nextInt(max - min + 1);

        return harfKismi.toString() + rakamKismi;
    }
}
