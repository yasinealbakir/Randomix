package com.randomix;

import java.util.Random;

public class PostaKodUret {

    private static final Random RANDOM = new Random();

    /**
     * Türkiye formatında 5 haneli rastgele posta kodu üretir.
     * (Gerçek illere uygunluk sağlamaz, sadece rastgele.)
     */
    public static String generate() {
        int kod = 10000 + RANDOM.nextInt(90000); // 10000-99999 arası
        return String.valueOf(kod);
    }
}
