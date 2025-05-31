package com.randomix;

import java.util.Random;

public class UnvanUret {

    private static final Random RANDOM = new Random();

    public static String generate() {
        return VeriSetleri.UNVANLAR.get(RANDOM.nextInt(VeriSetleri.UNVANLAR.size()));

    }
}
