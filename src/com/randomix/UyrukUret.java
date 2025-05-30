package com.randomix;


import com.randomix.VeriSetleri;
import java.util.Random;



/**
 *
 * @author yasin.albakir
 */
public class UyrukUret {
    
    private static final Random RANDOM = new Random();

    public static String generate() {
        return VeriSetleri.UYRUKLAR.get(RANDOM.nextInt(VeriSetleri.UYRUKLAR.size()));
    }
    
}
