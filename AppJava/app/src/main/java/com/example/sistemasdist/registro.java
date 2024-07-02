package com.example.sistemasdist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button btnyc = findViewById(R.id.btnyc);
        btnyc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnyc = new Intent(registro.this, MainActivity.class);
                startActivity(btnyc );
            }
        });
    }
}