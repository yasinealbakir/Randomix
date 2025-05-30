package com.randomix;

import java.util.List;
import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class KanGrubuUret {

    private static final Random random = new Random();

    public static final List<String> KAN_GRUPLARI = List.of(
            "A Rh+",
            "A Rh-",
            "B Rh+",
            "B Rh-",
            "AB Rh+",
            "AB Rh-",
            "O Rh+",
            "O Rh-"
    );

    public static String generate() {
        return KAN_GRUPLARI.get(random.nextInt(KAN_GRUPLARI.size()));
    }

}
