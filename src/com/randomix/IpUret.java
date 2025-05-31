package com.randomix;

import java.util.Random;

public class IpUret {

    private static final Random RANDOM = new Random();

    public static String generate() {
        int a = RANDOM.nextInt(256);
        int b = RANDOM.nextInt(256);
        int c = RANDOM.nextInt(256);
        int d = RANDOM.nextInt(256);
        return a + "." + b + "." + c + "." + d;
    }
}
