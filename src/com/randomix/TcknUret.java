package com.randomix;

import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class TcknUret {

    private static final Random random = new Random();

    public static String generate() {
        while (true) {
            int[] hane = new int[11];
            hane[0] = random.nextInt(9) + 1;
            for (int i = 1; i < 9; i++) {
                hane[i] = random.nextInt(10);
            }

            int toplamTek = hane[0] + hane[2] + hane[4] + hane[6] + hane[8];
            int toplamCift = hane[1] + hane[3] + hane[5] + hane[7];
            hane[9] = ((toplamTek * 7) + (toplamCift * 9)) % 10;
            hane[10] = ((toplamTek * 8) % 10);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 11; i++) {
                sb.append(hane[i]);
            }
            String tckn = sb.toString();

            if (checkTcknFormat(tckn)) {
                return tckn;
            }
        }

    }

    public static boolean checkTcknFormat(String tckn) {
        try {
            if (tckn.length() != 11) {
                return false;
            }
            int[] hane = new int[11];
            int toplam = 0;
            for (int i = 0; i < 11; i++) {
                hane[i] = Integer.parseInt(String.valueOf(tckn.charAt(i)));
                toplam += hane[i];
            }
            toplam -= hane[10];
            if ((toplam % 10) != hane[10]) {
                return false;
            }
            if (((hane[0] + hane[2] + hane[4] + hane[6] + hane[8]) * 7 + (hane[1] + hane[3] + hane[5] + hane[7]) * 9) % 10 != hane[9]) {
                return false;
            }
            if (((hane[0] + hane[2] + hane[4] + hane[6] + hane[8]) * 8) % 10 != hane[10]) {
                return false;
            }
            return hane[0] != 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
