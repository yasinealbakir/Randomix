package com.randomix;


import java.util.List;
import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class IlceUret {

    private static final Random random = new Random();

    public static String generate(String sehir) {
        List<String> ilceler = VeriSetleri.ILCELER.get(sehir);
        if (ilceler == null) {
            return null;
        }
        return ilceler.get(random.nextInt(ilceler.size()));
    }

}
