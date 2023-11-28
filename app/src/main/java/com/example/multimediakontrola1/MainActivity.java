package com.example.multimediakontrola1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText izenaEditText, abizenaEditText, telefonoaEditText, emailaEditText, jaiotzaDataEditText;
    private Button jarraituButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Elementuak identifikatu
        izenaEditText = findViewById(R.id.editTextIzena);
        abizenaEditText = findViewById(R.id.editTextAbizena);
        telefonoaEditText = findViewById(R.id.editTextTelefonoa);
        emailaEditText = findViewById(R.id.editTextEmaila);
        jaiotzaDataEditText = findViewById(R.id.editTextJaiotzaData);
        jarraituButton = findViewById(R.id.buttonJarraitu);

        // Jarraitu botoiari klik egitean
        jarraituButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Eskatutako datuak lortu
                String izena = izenaEditText.getText().toString();
                String abizena = abizenaEditText.getText().toString();
                String telefonoa = telefonoaEditText.getText().toString();
                String emaila = emailaEditText.getText().toString();
                String jaiotzaData = jaiotzaDataEditText.getText().toString();

                // Datuak bete badira
                if (!izena.isEmpty() && !abizena.isEmpty() && !telefonoa.isEmpty() && !emaila.isEmpty() && !jaiotzaData.isEmpty()) {
                    // Beste Activity-an datuak bidali
                    Intent intent = new Intent(MainActivity.this, laburpena.class);
                    intent.putExtra("izena", izena);
                    intent.putExtra("abizena", abizena);
                    intent.putExtra("telefonoa", telefonoa);
                    intent.putExtra("emaila", emaila);
                    intent.putExtra("jaiotzaData", jaiotzaData);
                    startActivity(intent);
                } else {
                    // Mezu bat erakutsi datuak sartu behar direla adierazten
                    showToast("Datu guztiak sartu behar dira.");
                }
            }
        });
    }

    // Toast erakutsi
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}