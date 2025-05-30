package com.randomix;

import java.util.List;
import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class AdresUret {

    private static final Random random = new Random();

    public static String generate() {
        List<String> adresler = VeriSetleri.ADRESLER;
        if (adresler.isEmpty()) {
            return null;
        }
        return adresler.get(random.nextInt(adresler.size()));
    }
  
}
