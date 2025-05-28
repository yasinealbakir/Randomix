package com.randomix;


import java.util.Random;


/**
 *
 * @author yasin.albakir
 */
public class AdUret {

    private static final Random random = new Random();

    public static String generate() {
        return VeriSetleri.ADLAR.get(random.nextInt(VeriSetleri.ADLAR.size()));
    }

}
