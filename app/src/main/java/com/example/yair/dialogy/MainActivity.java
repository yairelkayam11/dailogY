package com.example.yair.dialogy;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.icu.util.MeasureUnit;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    int r,g,b;
    LinearLayout LL;
    Random rnd = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        LL = (LinearLayout) findViewById(R.id.LL);

    }

    public void yair1 (View view) {

        AlertDialog.Builder adb;


        adb = new AlertDialog.Builder(this);
        adb.setTitle("Only Text");
        adb.setMessage("Hello world");

        AlertDialog ad = adb.create();
        ad.show();
    }

    public void yair2 (View view) {

        AlertDialog.Builder adb;


        adb = new AlertDialog.Builder(this);
        adb.setTitle("Text + Image");
        adb.setMessage("Look at my image");
        adb.setIcon(R.drawable.simann);


        AlertDialog ad = adb.create();
        ad.show();

    }

    public void yair3 (View view) {

        AlertDialog.Builder adb;


        adb = new AlertDialog.Builder(this);
        adb.setTitle("Text + Image + Button");
        adb.setMessage("Look I've added a button");
        adb.setIcon(R.drawable.greenv);
        adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }

        });

        AlertDialog ad = adb.create();
        ad.show();
    }

    public void yair4 (View view) {

        AlertDialog.Builder adb;


        adb = new AlertDialog.Builder(this);
        adb.setTitle("Text + Image + Two Button");
        adb.setMessage("Click 'Change' to see a magic");
        adb.setIcon(R.drawable.hat);
        adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }

        });

        r = rnd.nextInt(255);
        g = rnd.nextInt(255);
        b = rnd.nextInt(255);

        adb.setNegativeButton("Change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                LL.setBackgroundColor(Color.rgb(r,g,b));

            }
        });

        AlertDialog ad = adb.create();
        ad.show();

    }

    public void yair5 (View view) {

        AlertDialog.Builder adb;


        adb = new AlertDialog.Builder(this);
        adb.setTitle("Text + Image + Three Button");
        adb.setMessage("Click 'Reset' to be dazzled");
        adb.setIcon(R.drawable.phone);
        adb.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }

        });

        r = rnd.nextInt(255);
        g = rnd.nextInt(255);
        b = rnd.nextInt(255);

        adb.setPositiveButton("Change", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                LL.setBackgroundColor(Color.rgb(r, g, b));
            }
        });

        adb.setNegativeButton("Reset", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                LL.setBackgroundColor(Color.WHITE);
            }
        });

        AlertDialog ad = adb.create();        ad.show();

    }

    public boolean onCreateOptionsMenu (Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int nextActivity = item.getItemId();
        if (nextActivity == R.id.NextActivity) {
            Intent go = new Intent(this, Main2Activity.class);
            startActivity(go);
        }


        return true;


    }



}
