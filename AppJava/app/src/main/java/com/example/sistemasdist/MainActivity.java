package com.example.sistemasdist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnsession = findViewById(R.id.btnsession);
        btnsession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnsession = new Intent(MainActivity.this, menuprincila.class);
                startActivity(btnsession );
            }
        });
        Button btnalert = findViewById(R.id.btnalert);
        btnalert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnalert = new Intent(MainActivity.this, alerta.class);
                startActivity(btnalert );
            }
        });
        Button btnregis = findViewById(R.id.btnregis);
        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnregis = new Intent(MainActivity.this, registro.class);
                startActivity(btnregis );
            }
        });

    }
}