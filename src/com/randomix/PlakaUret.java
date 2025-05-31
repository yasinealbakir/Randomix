package com.randomix;

import java.util.Random;

public class PlakaUret {
    private static final Random RANDOM = new Random();

    /**
     * Türk plakası üretir. (ör: 34 ABC 1234)
     */
    public static String generate() {
        // İl kodu 01-81 arası (bazı yerlerde 2 rakamı başında sıfır ile gösterilir)
        int ilKodu = 1 + RANDOM.nextInt(81);
        String ilKoduStr = String.format("%02d", ilKodu);

        // 1-3 harf (A-Z)
        String harfler = "ABCDEFGHIJKLMNOPRSTUVYZ";
        int harfSayisi = 1 + RANDOM.nextInt(3); // 1, 2 veya 3 harf
        StringBuilder harfKismi = new StringBuilder();
        for (int i = 0; i < harfSayisi; i++) {
            harfKismi.append(harfler.charAt(RANDOM.nextInt(harfler.length())));
        }

        // 2-4 rakam (genellikle 3 veya 4)
        int rakamSayisi = 3 + RANDOM.nextInt(2); // 3 veya 4 rakam
        int min = (int) Math.pow(10, rakamSayisi - 1);
        int max = (int) Math.pow(10, rakamSayisi) - 1;
        int rakamKismi = min + RANDOM.nextInt(max - min + 1);

        // Plakayı oluştur
        return String.format("%s %s %d", ilKoduStr, harfKismi, rakamKismi);
    }
}
