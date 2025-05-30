package com.randomix;

import java.util.List;
import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class MedeniHalUret {
    
    private static final Random random = new Random();

    public static final List<String> MEDENI_HAL = List.of("Evli", "Bekar","Dul","Boþanmýþ","Evliliðin Ýptali","Evliliðin Feshi");

    public static String generate() {
        return MEDENI_HAL.get(random.nextInt(MEDENI_HAL.size()));
    }

}
