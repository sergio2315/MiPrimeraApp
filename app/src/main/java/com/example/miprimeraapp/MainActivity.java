package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView miTextView = findViewById(R.id.textViewMain);
        EditText miEditText1 = findViewById(R.id.editTextNumber);
        EditText miEditText2 = findViewById(R.id.editTextNumber2);
        Button miButton = findViewById(R.id.sumar);
        Button miButton2 = findViewById(R.id.restar);
        Button miButton3 = findViewById(R.id.multiplicar);
        Button miButton4 = findViewById(R.id.dividir);

        miButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int numero1 = Integer.parseInt(miEditText1.getText().toString());
                int numero2 = Integer.parseInt(miEditText2.getText().toString());
                int result = numero1 + numero2;
                miTextView.setText("EL resultado es :" + result);

            }
        });
        miButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int numero1 = Integer.parseInt(miEditText1.getText().toString());
                int numero2 = Integer.parseInt(miEditText2.getText().toString());
                int result = numero1 - numero2;
                miTextView.setText("EL resultado es :" + result);

            }
        });
        miButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int numero1 = Integer.parseInt(miEditText1.getText().toString());
                int numero2 = Integer.parseInt(miEditText2.getText().toString());
                int result = numero1 * numero2;
                miTextView.setText("EL resultado es :" + result);

            }
        });
        miButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int numero1 = Integer.parseInt(miEditText1.getText().toString());
                int numero2 = Integer.parseInt(miEditText2.getText().toString());
                int result = numero1 / numero2;
                miTextView.setText("EL resultado es :" + result);

            }
        });

    }

}