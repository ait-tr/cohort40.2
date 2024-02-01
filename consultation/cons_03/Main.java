package cons_03;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<String, Map<String, Double>> exchangeRates = new HashMap<>();

    public static void main(String[] args) {

        HashMap<String,Double> usd_eur = new HashMap<>();
        usd_eur.put("usd",1.09);
        usd_eur.put("eur",0.92);
// Доллар и лира
        HashMap<String,Double> usd_try = new HashMap<>();
        usd_try.put("try",30.35);
        usd_try.put("usd",0.033);
// Евро и лира.
        HashMap<String,Double> eur_try = new HashMap<>();
        eur_try.put("eur",0.030);
        eur_try.put("try",32.85);
// Вносим валюты в главную карту
        exchangeRates.put("usd_eur",usd_eur);
        exchangeRates.put("usd_try",usd_try);
        exchangeRates.put("eur_try",eur_try);
    }
}