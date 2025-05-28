package com.randomix;

import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class VgnUret {

    private static final Random random = new Random();

    public static String generate() {
        int[] digits = new int[10];
        for (int i = 0; i < 9; i++) {
            digits[i] = random.nextInt(10); // 0-9
        }

        int toplam = 0;
        for (int i = 0; i < 9; i++) {
            toplam += digits[i] * (i + 1);
        }
        int kalan = toplam % 10;
        digits[9] = kalan == 0 ? 0 : 10 - kalan;

        StringBuilder vergiNo = new StringBuilder();
        for (int digit : digits) {
            vergiNo.append(digit);
        }
        return vergiNo.toString();
    }

}
