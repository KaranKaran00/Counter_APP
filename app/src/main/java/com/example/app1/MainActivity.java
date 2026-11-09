package com.example.app1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //1 Create object
        Button btnCount;
        TextView txtCount;
        Button btnReset;

        Button btnFuelAPP,btnUserAPP;

        //2 bind UI with Java object
        btnCount = findViewById(R.id.btnCount);
        txtCount = findViewById(R.id.txtCount);
        btnReset = findViewById(R.id.btnReset);

        btnFuelAPP = findViewById(R.id.btnFuelApp);
        btnUserAPP = findViewById(R.id.btnUserAPP);

        //3 onclick Listener
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                txtCount.setText(""+ count);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                txtCount.setText(""+ count);
            }
        });

        btnUserAPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, form.class);

                startActivity(i);
            }
        });

        btnFuelAPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FuelExtimateApp.class);

                startActivity(i);
            }
        });
    }
}