package com.randomix;

import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class UlkeUret {

    private static final Random RANDOM = new Random();

    public static String generate() {
        return VeriSetleri.ULKELER.get(RANDOM.nextInt(VeriSetleri.ULKELER.size()));
    }

}
