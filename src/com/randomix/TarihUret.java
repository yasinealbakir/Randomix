package com.randomix;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 *
 * @author yasin.albakir
 */
public class TarihUret {

    private static final Random RANDOM = new Random();

    // Do�um tarihi �retir (varsay�lan: 18 ile 65 ya� aras�nda)
    public static String dogumTarihi() {
        return dogumTarihi(18, 65);
    }

    // �stenilen ya� aral���nda do�um tarihi �retir
    public static String dogumTarihi(int minYas, int maxYas) {
        int yas = minYas + RANDOM.nextInt(maxYas - minYas + 1);
        LocalDate today = LocalDate.now();
        LocalDate birthDate = today.minusYears(yas)
                .minusDays(RANDOM.nextInt(365));
        return birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    // Bug�n�n tarihi
    public static String bugunTarih() {
        LocalDate today = LocalDate.now();
        return today.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    // Bug�n�n saat ve tarihi
    public static String bugunTarihSaat() {
        LocalDateTime now = LocalDateTime.now();
        return now.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
    }

    // �u anki saat ve dakika
    public static String bugunSaat() {
        LocalTime now = LocalTime.now();
        return now.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

}
