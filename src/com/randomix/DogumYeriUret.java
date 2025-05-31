package com.randomix;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class DogumYeriUret {

    private static final Random random = new Random();

    public static String generate() {
        return VeriSetleri.SEHIRLER.get(random.nextInt(VeriSetleri.SEHIRLER.size()));
    }
}
