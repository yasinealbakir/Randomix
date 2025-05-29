package com.randomix;

import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class SirketAdiUret {

    private static final Random random = new Random();

    public static String generate() {
        return VeriSetleri.SIRKETLER.get(random.nextInt(VeriSetleri.SIRKETLER.size()));
    }

}
