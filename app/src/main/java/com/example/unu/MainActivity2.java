package com.example.unu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private EditText baseEditText;
    private EditText exponenteEditText;
    private TextView resultadoTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        baseEditText = findViewById(R.id.EditTextValor1Potencia);
        exponenteEditText = findViewById(R.id.EditTextValor2Potencia);
        resultadoTextView = findViewById(R.id.TextViewResultadoPotencia);

        Button CalcularBotton = findViewById(R.id.button_Operar_potencia);
        CalcularBotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double base = Double.parseDouble(baseEditText.getText().toString());
                double exponent = Double.parseDouble(exponenteEditText.getText().toString());
                double resultado= Math.pow(base, exponent);
                resultadoTextView.setText(String.valueOf(resultado));
            }
        });
    }
}

