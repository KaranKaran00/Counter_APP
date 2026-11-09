package com.example.app1;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class FuelExtimateApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_fuel_extimate_app);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 1 create object
        Button btnCost;
        EditText txtDist;
        EditText txtEffc;
        EditText txtPrice;
        TextView txtCost;

        //2 bind UI to java Object
        btnCost = findViewById(R.id.btnCost);
        txtCost = findViewById(R.id.txtFuelCost);

        txtDist = findViewById(R.id.txtDist);
        txtEffc = findViewById(R.id.txtEffc);
        txtPrice= findViewById(R.id.txtPrice);

        btnCost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dist = txtDist.getText().toString();
                String effc = txtEffc.getText().toString();
                String price = txtPrice.getText().toString();

                int d = Integer.parseInt(dist);
                int e = Integer.parseInt(effc);
                int p = Integer.parseInt(price);

                int ans = (d/e) * p;

                txtCost.setText(""+ ans + " PRK");
            }
        });
    }
}