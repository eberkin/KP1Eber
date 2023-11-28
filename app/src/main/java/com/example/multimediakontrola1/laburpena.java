package com.example.multimediakontrola1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class laburpena extends AppCompatActivity {
    private TextView textViewSummary;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laburpena);

        // Elementua identifikatu
        textViewSummary = findViewById(R.id.textViewSummary);

        // Datuak jaso
        String izena = getIntent().getStringExtra("izena");
        String abizena = getIntent().getStringExtra("abizena");
        String telefonoa = getIntent().getStringExtra("telefonoa");
        String emaila = getIntent().getStringExtra("emaila");
        String jaiotzaData = getIntent().getStringExtra("jaiotzaData");

        // Laburpena erakutsi
        String laburpena = "Izena: " + izena + "\n"
                + "Abizena: " + abizena + "\n"
                + "Telefonoa: " + telefonoa + "\n"
                + "Emaila: " + emaila + "\n"
                + "Jaiotza Data: " + jaiotzaData;

        textViewSummary.setText(laburpena);
    }
}