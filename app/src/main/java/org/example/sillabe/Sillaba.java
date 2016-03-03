package org.example.sillabe;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;


/**
 * Created by paolo on 02/03/16.
 */
public class Sillaba extends TextView {

    static final int MAIUSCOLO = 1;
    static final int MINUSCOLO = 2;
    static final int PRIMA_MAIUSCOLO = 3;
    static final int CORSIVO_MINUSCOLO = 4;
    static final int CORSIVO_PRIMA_MAIUSCOLO = 5;
    private String valore;

    private int stile;

    //COSTRUTTORI
    public Sillaba(Context context) {
        super(context);
        this.valore = "aa";
        this.stile = Sillaba.MINUSCOLO;
        this.setText(this.valore);
        creaStyleable();
    }

    public Sillaba(Context context, String valore, int stile) {
        super(context);
        this.valore = valore;
        this.stile = stile;
        this.setText(this.valore);

        creaStyleable();

    }

    public Sillaba(Context context, AttributeSet attrs) {
        super(context, attrs);


    }

    public Sillaba(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

    }

    private void creaStyleable() {
        this.setTextSize(40);
        this.setWidth(100);
        this.setGravity(Gravity.CENTER);
        this.setTextColor(Color.BLACK);
    }


    //METODI PUBBLICI
    public String getValore() {
        return valore;
    }

    public void setValore(String valore) {
        this.valore = valore;
        this.setText(valore);

    }

    public boolean èUgualeA(Sillaba s) {
        return (this.valore.equals(s.valore));
    }

    public void corretta() {
        this.setTextColor(GREEN);

    }

    public void errata() {
        this.setTextColor(RED);

    }
    public int getStile() {
        return stile;
    }

    public void setStile(int stile) {
        this.stile = stile;
    }


}
