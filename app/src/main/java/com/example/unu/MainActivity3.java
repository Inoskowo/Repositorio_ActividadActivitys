package com.example.unu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editText1 = findViewById(R.id.EditText_Valor1);
        editText2 = findViewById(R.id.Edit_TextValor2);
        resultTextView = findViewById(R.id.textview_multiplicar);

        Button buttonMultiplicar = findViewById(R.id.button_multiplicar);
        buttonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                int resultado = num1 * num2;
                resultTextView.setText(String.valueOf(resultado));
            }
        });
    }
}