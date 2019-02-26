package com.example.menu_kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class menu_krg extends AppCompatActivity {
    private Button btnn;
    private EditText angk1,angk2;
    private TextView tview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_krg);
        btnn = findViewById(R.id.btn);
        angk1 = findViewById(R.id.ang1);
        angk2 = findViewById(R.id.ang2);
        tview = findViewById(R.id.tv);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String angka1 = angk1.getText().toString();
                    String angka2 = angk2.getText().toString();
                    Double ang1 = Double.parseDouble(angka1);
                    Double ang2 = Double.parseDouble(angka2);
                    Double hsil = ang1 - ang2;
                    String hasil = String.valueOf(hsil);
                    tview.setText(hasil);
                }catch(NumberFormatException n){
                    Toast.makeText(getApplicationContext(),"Field Empty",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
