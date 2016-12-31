package com.androidlokomedia.dialoglanguage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private TextView textView;

//    private void showDialog(){
//        sharedPreferences = this.getSharedPreferences("com.androidlokomedia.dialoglanguage", Context.MODE_PRIVATE);
//
//        new AlertDialog.Builder(this)
//                .setIcon(android.R.drawable.ic_dialog_alert)
//                .setTitle("Bahasa anda yang inginkan?")
//                .setMessage("do yo want english or indonesia")
//                .setPositiveButton("english", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        sharedPreferences.edit().putString("Bahasa","english").apply();
//                        textView.setText("english");
//                    }
//                }).setNegativeButton("indonesia", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                sharedPreferences.edit().putString("Bahasa","indonesia").apply();
//                textView.setText("indonesia");
//            }
//        }).show();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        textView = (TextView) findViewById(R.id.hello);
//        sharedPreferences = this.getSharedPreferences("com.androidlokomedia.dialoglanguage", Context.MODE_PRIVATE);
//
//        String pilihBahasa = sharedPreferences.getString("Bahasa", "");
//        if (pilihBahasa == "") {
//            showDialog();
//        } else {
//            textView.setText(pilihBahasa);
//        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                showDialog();
            }
        });
    }

}
