package org.example.sillabe;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Sillaba sillabaDaRiconoscere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inizializzaGioco();


    }

    void inizializzaGioco() {
        sillabaDaRiconoscere = new Sillaba(this, Fonemi.fonemaCasuale(Fonemi.FONEMI_B), Sillaba.MINUSCOLO);

        TableRow primaRiga = (TableRow) findViewById(R.id.primaRiga);
        primaRiga.addView(sillabaDaRiconoscere);


        TableRow riga;
        Sillaba s;
        TableLayout tabella = (TableLayout) findViewById(R.id.tabella);

        for (int i = 1; i <= 8; i++) {
            riga = new TableRow(this);
            riga.setGravity(Gravity.CENTER);
            tabella.addView(riga);

            for (int j = 1; j <= 6; j++) {
                s = new Sillaba(this, Fonemi.fonemaCasuale(Fonemi.FONEMI_B), Sillaba.MINUSCOLO);

                s.setClickable(true);
                s.setOnClickListener(this);
                riga.addView(s);
            }

        }
    }

    public void onClick(View v) {
        Sillaba sillabaCliccata = (Sillaba) v;

        if (sillabaCliccata.èUgualeA(sillabaDaRiconoscere))
            sillabaCliccata.corretta();
        else sillabaCliccata.errata();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {

    }

}
