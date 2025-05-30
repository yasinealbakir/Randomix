package com.randomix;

import java.util.List;
import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class CinsiyetUret {

    private static final Random random = new Random();

    public static final List<String> CINSIYET = List.of("Erkek", "Kadýn");

    public static String generate() {
        return CINSIYET.get(random.nextInt(CINSIYET.size()));
    }

}
