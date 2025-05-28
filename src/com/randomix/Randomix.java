package com.randomix;

/**
 *
 * @author yasin.albakir
 */
public class Randomix {

    public static String ad() {
        return AdUret.generate();
    }

    public static String soyad() {
        return SoyadUret.generate();
    }

    public static String sehir() {
        return SehirUret.generate();
    }

    public static String ilce(String sehir) {
        return IlceUret.generate(sehir);
    }
    
    public static String tckn() {
        return TcknUret.generate();
    }
    

}
