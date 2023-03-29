package com.example.unu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button boton1;
    EditText EditText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1=findViewById(R.id.button_main1);
        EditText1=findViewById(R.id.TextMain1);

        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int valor = Integer.parseInt(EditText1.getText().toString());

                switch (valor) {
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this, MainActivity3.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this, ActivitySuma.class);
                        startActivity(intent3);
                        break;
                }
            }
        });
    }
}
