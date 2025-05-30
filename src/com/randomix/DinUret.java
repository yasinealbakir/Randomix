package com.randomix;

import java.util.List;
import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class DinUret {

    private static final Random random = new Random();

    public static final List<String> DIN = List.of("�slam", "Hristiyanl�k", "Musevilik", "Budizm", "Hinduizm", "Ateizm", "Agnostisizm", "�intoizm", "Sihizm", "Taoizm", "Bahailik", "Di�er");

    public static String generate() {
        return DIN.get(random.nextInt(DIN.size()));
    }

}
