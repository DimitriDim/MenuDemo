package fr.m2i.menudemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Administrateur on 10/01/2018.
 */

public class ActivityMenu extends AppCompatActivity {


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
        Intent monIntent;

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_ActiviteGrp) {
            return true;
        }
        if (id == R.id.action_Activite1) {
            monIntent = new Intent(this, Main1Activity.class);
            startActivity(monIntent);
            return true;
        }
        if (id == R.id.action_Activite2) {
            monIntent = new Intent(this, Main2Activity.class);
            startActivity(monIntent);
            return true;
        }
        if (id == R.id.action_Activite3) {
            monIntent = new Intent(this, Main3Activity.class);
            startActivity(monIntent);
            return true;
        }
        if (id == R.id.action_Connexion) {
            item.setChecked(!item.isChecked());
            return true;
        }
        if (id == R.id.action_Parametre) {
            monIntent = new Intent(this, Main2Activity.class);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
