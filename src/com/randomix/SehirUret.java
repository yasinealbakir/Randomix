package com.randomix;


import java.util.Random;


/**
 *
 * @author yasin.albakir
 */
public class SehirUret {

    private static final Random random = new Random();

    public static String generate() {
        return VeriSetleri.SEHIRLER.get(random.nextInt(VeriSetleri.SEHIRLER.size()));
    }

}
