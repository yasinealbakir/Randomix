package com.randomix;

import java.util.List;
import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class DinUret {

    private static final Random random = new Random();

    public static final List<String> DIN = List.of("Ýslam", "Hristiyanlýk", "Musevilik", "Budizm", "Hinduizm", "Ateizm", "Agnostisizm", "Þintoizm", "Sihizm", "Taoizm", "Bahailik", "Diðer");

    public static String generate() {
        return DIN.get(random.nextInt(DIN.size()));
    }

}
