package com.randomix;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author yasin.albakir
 */
public class VeriSetleri {

    public static final List<String> ADLAR = new ArrayList<>();

    public static final List<String> SOYADLAR = new ArrayList<>();

    public static final List<String> SEHIRLER = new ArrayList<>();

    public static final Map<String, List<String>> ILCELER = new HashMap<>();

    static {
        try {
            InputStream is = VeriSetleri.class.getClassLoader().getResourceAsStream("il-ilce.json");
            if (is == null) {
                throw new RuntimeException("il-ilce.json bulunamadý!");
            }

            String jsonTxt = new String(is.readAllBytes(), StandardCharsets.UTF_8);
            JSONObject jsonObj = new JSONObject(jsonTxt);
            JSONArray dataArr = jsonObj.getJSONArray("data");

            for (int i = 0; i < dataArr.length(); i++) {
                JSONObject sehirObj = dataArr.getJSONObject(i);
                String sehir = sehirObj.getString("il_adi");
                SEHIRLER.add(sehir);

                JSONArray districtsArr = sehirObj.getJSONArray("ilceler");
                List<String> ilceListesi = new ArrayList<>();
                for (int j = 0; j < districtsArr.length(); j++) {
                    JSONObject ilceObj = districtsArr.getJSONObject(j);
                    String ilce = ilceObj.getString("ilce_adi");
                    ilceListesi.add(ilce);
                }
                ILCELER.put(sehir, ilceListesi);
            }
        } catch (IOException | RuntimeException e) {
        }

        try {
            InputStream is = VeriSetleri.class.getClassLoader().getResourceAsStream("ad.json");
            if (is == null) {
                throw new RuntimeException("ad.json bulunamadý!");
            }
            String jsonTxt = new String(is.readAllBytes(), StandardCharsets.UTF_8);
            JSONArray arr = new JSONArray(jsonTxt);
            for (int i = 0; i < arr.length(); i++) {
                ADLAR.add(arr.getString(i));
            }
        } catch (IOException | RuntimeException e) {
        }

        try {
            InputStream is = VeriSetleri.class.getClassLoader().getResourceAsStream("soyad.json");
            if (is == null) {
                throw new RuntimeException("soyad.json bulunamadý!");
            }
            String jsonTxt = new String(is.readAllBytes(), StandardCharsets.UTF_8);
            JSONArray arr = new JSONArray(jsonTxt);
            for (int i = 0; i < arr.length(); i++) {
                SOYADLAR.add(arr.getString(i));
            }
        } catch (IOException | RuntimeException e) {
            System.err.println("Hata: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
