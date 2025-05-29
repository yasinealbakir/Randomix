package com.randomix;

import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class TelefonNoUret {

    private static final Random RANDOM = new Random();

    /**
     * Cep telefonu üretir: 555 555 55 55
     * @return 
     */
    public String cep() {
        int ikinciHane = RANDOM.nextInt(10); // 0-9
        int ucuncuHane = RANDOM.nextInt(10); // 0-9
        String ilkUc = "5" + ikinciHane + ucuncuHane;

        int dorduncuBesinciAltinci = 100 + RANDOM.nextInt(900); // 100-999
        int yedinciSekizinci = 10 + RANDOM.nextInt(90);         // 10-99
        int dokuzuncuOnuncu = 10 + RANDOM.nextInt(90);          // 10-99

        return String.format("%s %03d %02d %02d",
                ilkUc,
                dorduncuBesinciAltinci,
                yedinciSekizinci,
                dokuzuncuOnuncu
        );
    }

    /**
     * Ev telefonu üretir: 312 434 10 00
     * Alan kodu il-ilce.json'dan alýnýr.
     * @return 
     */
    public String ev() {
        // Rastgele bir þehir seç
        int sehirIndex = RANDOM.nextInt(VeriSetleri.SEHIRLER.size());
        String sehir = VeriSetleri.SEHIRLER.get(sehirIndex);

        // Alan kodunu map'ten çek
        String alanKodu = VeriSetleri.ALAN_KODLARI.getOrDefault(sehir, "312");

        int numara1 = 100 + RANDOM.nextInt(900);   // 100-999
        int numara2 = 10 + RANDOM.nextInt(90);     // 10-99
        int numara3 = 10 + RANDOM.nextInt(90);     // 10-99

        return String.format("%s %03d %02d %02d",
                alanKodu,
                numara1,
                numara2,
                numara3
        );
    }

}
