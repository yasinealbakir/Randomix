package com.randomix;


import java.util.Random;


/**
 *
 * @author yasin.albakir
 */
public class SoyadUret {

    private static final Random random = new Random();

    public static String generate() {
        return VeriSetleri.SOYADLAR.get(random.nextInt(VeriSetleri.SOYADLAR.size()));
    }

}
