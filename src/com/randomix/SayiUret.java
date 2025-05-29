package com.randomix;

import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class SayiUret {

    private static final Random random = new Random();

    public static int generate(int min, int max) {

        if (min > max) {
            throw new IllegalArgumentException("min, max'tan büyük olamaz!");
        }
        return random.nextInt((max - min) + 1) + min;

    }

}
