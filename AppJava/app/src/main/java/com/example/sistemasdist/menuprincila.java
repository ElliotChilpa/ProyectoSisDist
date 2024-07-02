package com.example.sistemasdist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuprincila extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprincila);

        Button btnmsjdirect = findViewById(R.id.btnmsjdirect);
        btnmsjdirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnmsjdirect = new Intent(menuprincila.this, mensaje.class);
                startActivity(btnmsjdirect);
            }
        });

        Button btnalerta = findViewById(R.id.btnalerta);
        btnalerta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnalerta  = new Intent(menuprincila.this, alerta.class);
                startActivity(btnalerta);
            }
        });

    }
}