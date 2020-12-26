package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.os.SystemClock;
import android.text.Editable;
import android.view.ActionMode;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.miprimeraapp.databinding.ActivityMainBinding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private boolean clickSignos = false;
    private boolean clickSignoRestar = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //bloqueo de giro de pantalla
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (binding.NumberOne.getText().toString().equals("0")) {
            binding.NumberOne.setText("");
        }
        binding.btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.NumberOne.setText(binding.NumberOne.getText() + "1");
                clickSignos = false;
                clickSignoRestar = false;
            }
        });
        binding.btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.NumberOne.setText(binding.NumberOne.getText() + "2");
                clickSignos = false;
                clickSignoRestar = false;
            }
        });
        binding.btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.NumberOne.setText(binding.NumberOne.getText() + "3");
                clickSignos = false;
                clickSignoRestar = false;
            }
        });
        binding.btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.NumberOne.setText(binding.NumberOne.getText() + "4");
                clickSignos = false;
                clickSignoRestar = false;
            }
        });
        binding.btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.NumberOne.setText(binding.NumberOne.getText() + "5");
                clickSignos = false;
                clickSignoRestar = false;
            }
        });
        binding.btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.NumberOne.setText(binding.NumberOne.getText() + "6");
                clickSignos = false;
                clickSignoRestar = false;
            }
        });
        binding.btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.NumberOne.setText(binding.NumberOne.getText() + "7");
                clickSignos = false;
                clickSignoRestar = false;
            }
        });
        binding.btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.NumberOne.setText(binding.NumberOne.getText() + "8");
                clickSignos = false;
                clickSignoRestar = false;
            }
        });
        binding.btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.NumberOne.setText(binding.NumberOne.getText() + "9");
                clickSignos = false;
                clickSignoRestar = false;
            }
        });
        binding.btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.NumberOne.setText(binding.NumberOne.getText() + "0");
                clickSignos = false;
                clickSignoRestar = false;
            }
        });
        binding.btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.NumberOne.length() != 0) {
                    binding.NumberOne.setText(binding.NumberOne.getText().subSequence(0, binding.NumberOne.length() - 1));
                    clickSignos = false;
                }
            }
        });
        binding.btnBorrarTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.NumberOne.setText("");
                binding.textViewMain.setText("" + 0);
                clickSignoRestar = false;
            }
        });
        binding.btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (binding.NumberOne.length() != 0 && clickSignos == false) {
                    binding.NumberOne.setText(binding.NumberOne.getText() + ".");
                    clickSignos = true;
                    clickSignoRestar = true;
                }
            }
        });
        binding.btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.NumberOne.getText().toString().endsWith("*")//reemplaza ultimo caracter por signo +
                        ||binding.NumberOne.getText().toString().endsWith("/")
                        ||binding.NumberOne.getText().toString().endsWith("-")) {
                    binding.NumberOne.setText(binding.NumberOne.getText().subSequence(0,binding.NumberOne.getText().length()-1)+ "+");
                }
                if (binding.NumberOne.length() != 0 && clickSignos == false) {
                    binding.NumberOne.setText(binding.NumberOne.getText() + "+");
                    clickSignos = true;
                    clickSignoRestar = false;
                }
            }
        });
        binding.btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.NumberOne.getText().toString().endsWith("+")){
                    binding.NumberOne.setText(binding.NumberOne.getText().subSequence(0,binding.NumberOne.getText().length()-1)+ "-");
                }
                else if (binding.NumberOne.length() >= 0 &&clickSignoRestar==false) {
                    binding.NumberOne.setText(binding.NumberOne.getText() + "-");
                    clickSignoRestar = true;
                }
            }
        });
        binding.btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.NumberOne.getText().toString().endsWith("-") //reemplaza ultimo caracter por signo +
                       || binding.NumberOne.getText().toString().endsWith("+")
                        &&clickSignoRestar==false
                       || binding.NumberOne.getText().toString().endsWith("/")){
                    binding.NumberOne.setText(binding.NumberOne.getText().subSequence(0,binding.NumberOne.getText().length()-1)+ "*");
                }
                if (binding.NumberOne.length() != 0 && clickSignos == false) {
                    binding.NumberOne.setText(binding.NumberOne.getText() + "*");
                    clickSignos = true;
                    clickSignoRestar = false;
                }
            }
        });
        binding.btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.NumberOne.getText().toString().endsWith("-") //reemplaza ultimo caracter por signo +
                        || binding.NumberOne.getText().toString().endsWith("+")
                        || binding.NumberOne.getText().toString().endsWith("*")) {
                    binding.NumberOne.setText(binding.NumberOne.getText().subSequence(0,binding.NumberOne.getText().length()-1)+ "/");
                }
                if (binding.NumberOne.length() != 0 && clickSignos == false&&clickSignoRestar==false) {
                    binding.NumberOne.setText(binding.NumberOne.getText() + "/");
                    clickSignos = true;
                    clickSignoRestar = false;
                }
            }
        });
        binding.btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.NumberOne.length() != 0) {
                    double resultado = 0;
                    String[] pantalla = binding.NumberOne.getText().toString().split("-|\\+|\\*|/");
                    String temporal = "";
                    int contador1 = 0;
                    for (int i = 0; i < pantalla.length - 1; i++) {
                        if (pantalla[i].equals("")) {
                            temporal = pantalla[i + 1];
                            pantalla[i + 1] = "";
                            pantalla[i] = temporal;
                            contador1 = contador1 + 1;
                        }
                    }
                    for (int i = 0; i < pantalla.length - 1; i++) {
                        if (pantalla[i].equals("")) {
                            temporal = pantalla[i + 1];
                            pantalla[i + 1] = "";
                            pantalla[i] = temporal;
                            contador1 = contador1 + 1;
                        }
                    }
                    int largoNum1 = pantalla[0].length();
                    char operador1 = binding.NumberOne.getText().charAt(largoNum1);
                    double num1 = Double.parseDouble(pantalla[0]);
                    double num2 = Double.parseDouble(pantalla[1]);
                    //int num3 = Integer.parseInt(pantalla[2]);
                    if (binding.NumberOne.getText().charAt(0) != '-') {
                        switch (operador1) {
                            case '+':
                                resultado = num1 + num2;
                                break;
                            case '-':
                                resultado = num1 - num2;
                                break;
                            case '*':
                                if (binding.NumberOne.getText().charAt(largoNum1 + 1) == '-') {
                                    resultado = num1 * -num2;
                                } else {
                                    resultado = num1 * num2;
                                }
                                break;
                            case '/':
                                if (num2 != 0) {
                                    if (binding.NumberOne.getText().charAt(largoNum1 + 1) == '-') {
                                        resultado = num1 / -num2;
                                    } else {
                                        resultado = num1 / num2;
                                    }
                                }
                                break;
                        }
                        // String resultadoFinal= String.format("%.4f",resultado); linea para limitar decimales
                        binding.textViewMain.setText("" + resultado);
                    } else {
                        operador1 = binding.NumberOne.getText().charAt(largoNum1 + 1);
                        switch (operador1) {
                            case '+':
                                resultado = -num1 + num2;
                                break;
                            case '-':
                                resultado = -num1 - num2;
                                break;
                            case '*':
                                if (binding.NumberOne.getText().charAt(largoNum1 + 2) == '-') {
                                    resultado = num1 * num2;
                                } else {
                                    resultado = -num1 * num2;
                                }
                                break;
                            case '/':
                                if (num2 != 0) {
                                    if (binding.NumberOne.getText().charAt(largoNum1 + 2) == '-') {
                                        resultado = num1 / num2;
                                    } else {
                                        resultado = -num1 / num2;
                                    }
                                }
                                break;
                        }
                        // String resultadoFinal= String.format("%.4f",resultado); linea para limitar decimales
                        binding.textViewMain.setText("" + resultado);
                    }
                }
            }
        });
        binding.btnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}