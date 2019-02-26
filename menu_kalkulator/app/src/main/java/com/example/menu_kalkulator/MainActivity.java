package com.example.menu_kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private Button tblbgi;
    private Button tblkrg;
    private Button tblkli;
    private Button tbltbh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tblbgi = findViewById(R.id.btnbgi);
        tblkrg = findViewById(R.id.btnkrg);
        tblkli = findViewById(R.id.btnkli);
        tbltbh = findViewById(R.id.btntbh);


        tbltbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this,menu_tbh.class);
                startActivity(moveIntent);
            }
        });
        tblkrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this,menu_krg.class);
                startActivity(moveIntent);
            }
        });
        tblbgi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this,menu_bagi.class);
                startActivity(moveIntent);
            }
        });
        tblkli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this,menu_kali.class);
                startActivity(moveIntent);
            }
        });
    }
}
