package com.randomix;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class AdUret {

    private static final Random RANDOM = new Random();

    private static final List<String> tumAdlar;

    static {
        tumAdlar = new ArrayList<>();
        tumAdlar.addAll(VeriSetleri.ADLAR_ERKEK);
        tumAdlar.addAll(VeriSetleri.ADLAR_KADIN);
    }

    public String erkek() {
        return VeriSetleri.ADLAR_ERKEK.get(RANDOM.nextInt(VeriSetleri.ADLAR_ERKEK.size()));
    }

    public String kadin() {
        return VeriSetleri.ADLAR_KADIN.get(RANDOM.nextInt(VeriSetleri.ADLAR_KADIN.size()));
    }

    public String rastgele() {
        return RANDOM.nextBoolean() ? erkek() : kadin();
    }

    public String babaAdi() {
        return VeriSetleri.ADLAR_BABA_ADI.get(RANDOM.nextInt(VeriSetleri.ADLAR_BABA_ADI.size()));
    }

    public String anneAdi() {
        return VeriSetleri.ADLAR_ANNE_ADI.get(RANDOM.nextInt(VeriSetleri.ADLAR_ANNE_ADI.size()));
    }

    public String tamAd() {
        if (tumAdlar.isEmpty() || VeriSetleri.SOYADLAR.isEmpty()) {
            throw new IllegalStateException("Ad veya soyad listesi boþ!");
        }
        return tumAdlar.get(RANDOM.nextInt(tumAdlar.size())) + " "
                + VeriSetleri.SOYADLAR.get(RANDOM.nextInt(VeriSetleri.SOYADLAR.size()));
    }

}
