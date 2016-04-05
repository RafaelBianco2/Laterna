package com.usuario.lanterna;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by usuario on 12/01/2016.
 */
public class screen extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen);

    }
    public void onBackPressed() {
        setContentView(R.layout.activity_main);

       }
 }


