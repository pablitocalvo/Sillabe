package org.example.sillabe;

import java.util.Random;

/**
 * Created by paolo on 03/03/16.
 */
public class Fonemi {
    static protected final String[] VOCALI = {"a", "e", "i", "o", "u"};
    static protected final String[] FONEMI_B = {"ba", "be", "bi", "bo", "bu"};
    static final String[] FONEMI_C = {"ci", "ce",};
    static final String[] FONEMI_CH = {"ca", "che", "chi", "co", "cu"};
    static final String[] FONEMI_D = {"da", "de", "di", "do", "du"};

    protected static final String[] FONEMI_ALL = unisciTutto();


    private static String[] unisciTutto() {
        String[] ris = new String[0];
        ris = unisci(ris, VOCALI);
        ris = unisci(ris, FONEMI_B);
        ris = unisci(ris, FONEMI_C);
        ris = unisci(ris, FONEMI_CH);
        ris = unisci(ris, FONEMI_D);

        return ris;
    }

    public static String[] unisci(String[] a, String[] b) {
        int length = a.length + b.length;
        String[] result = new String[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

    public static String fonemaCasuale(String[] da) {
        Random r = new Random();
        int i = r.nextInt(da.length - 1);
        return da[i];
    }

    public static String fonemaCasuale() {
        return fonemaCasuale(FONEMI_ALL);
    }


}
