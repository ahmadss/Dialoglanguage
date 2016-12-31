package com.androidlokomedia.dialoglanguage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.hello);
        final SharedPreferences sharedPreferences = this.getSharedPreferences("com.androidlokomedia.dialoglanguage", Context.MODE_PRIVATE);

        String pilihBahasa = sharedPreferences.getString("Bahasa", "");

        if (pilihBahasa == "") {
            new AlertDialog.Builder(this)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Bahasa anda yang inginkan?")
                    .setMessage("do yo want english or indonesia")
                    .setPositiveButton("english", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            sharedPreferences.edit().putString("Bahasa","english").apply();
                        }
                    }).setNegativeButton("indonesia", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    sharedPreferences.edit().putString("Bahasa","indonesia").apply();
                }
            }).show();
        } else {
            textView.setText(pilihBahasa);
        }
    }
}
