package org.example.sillabe;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import java.util.Random;


/**
 * Created by paolo on 02/03/16.
 */
public class Sillaba extends TextView {

    static final int MAIUSCOLO = 1;
    static final int MINUSCOLO = 2;
    static final int PRIMA_MAIUSCOLO = 3;
    static final int CORSIVO_MINUSCOLO = 4;
    static final int CORSIVO_PRIMA_MAIUSCOLO = 5;
    private static String[] fonemi = {"ba", "be", "bi", "bo", "bu"};
    private String valore;

    private int stile;

    public Sillaba(Context context) {
        super(context);
        CreaSillaba();
    }

    public Sillaba(Context context, AttributeSet attrs) {
        super(context, attrs);
        CreaSillaba();

    }

    public Sillaba(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        CreaSillaba();
    }

    private static String fonemaCasuale() {
        Random r = new Random();
        int i = r.nextInt(fonemi.length - 1);
        return fonemi[i];
    }

    //COSTRUTTORI
    private void CreaSillaba() {
        this.valore = fonemaCasuale();
        this.stile = Sillaba.MAIUSCOLO;
        this.setText(this.valore);
    }

    //METODI PUBBLICI
    public String getValore() {
        return valore;
    }

    public void setValore(String valore) {
        this.valore = valore;
        this.setText(valore);

    }

    public int getStile() {
        return stile;
    }

    public void setStile(int stile) {
        this.stile = stile;
    }
}
