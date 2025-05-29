package com.randomix;

import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class AdUret {

    private static final Random RANDOM = new Random();

    public String erkek() {
        return VeriSetleri.ADLAR_ERKEK.get(RANDOM.nextInt(VeriSetleri.ADLAR_ERKEK.size()));
    }

    public String kadin() {
        return VeriSetleri.ADLAR_KADIN.get(RANDOM.nextInt(VeriSetleri.ADLAR_KADIN.size()));
    }

    public String rastgele() {
        return RANDOM.nextBoolean() ? erkek() : kadin();
    }

}
