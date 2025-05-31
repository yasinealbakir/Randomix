package com.randomix;

import java.util.Random;

public class MetinUret {

    private static final Random RANDOM = new Random();

    public String kelime(int adet) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < adet; i++) {
            String kelime = VeriSetleri.KELIMELER.get(RANDOM.nextInt(VeriSetleri.KELIMELER.size()));
            sb.append(kelime);
            if (i < adet - 1) sb.append(" ");
        }
        return sb.toString();
    }

    public String cumle(int cumleSayisi) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cumleSayisi; i++) {
            int kelimeAdedi = 4 + RANDOM.nextInt(8); // 4-11 kelime
            String c = kelime(kelimeAdedi);
            sb.append(Character.toUpperCase(c.charAt(0))).append(c.substring(1)).append(". ");
        }
        return sb.toString().trim();
    }

    public String paragraf(int paragrafSayisi) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < paragrafSayisi; i++) {
            int cumleAdedi = 3 + RANDOM.nextInt(3); // 3-5 cümle
            sb.append(cumle(cumleAdedi)).append("\n\n");
        }
        return sb.toString().trim();
    }

}
