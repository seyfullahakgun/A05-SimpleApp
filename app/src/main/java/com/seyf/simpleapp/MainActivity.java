package com.seyf.simpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double number1;
    double number2;
    double result;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button sum = findViewById(R.id.buttonSum);
        final Button deduct = findViewById(R.id.buttonDeduct);
        final Button multi = findViewById(R.id.buttonMulti);
        final Button divide = findViewById(R.id.buttonDivide);
        final Button equal = findViewById(R.id.equal);
        final Button clear = findViewById(R.id.clear);
        final TextView resultBar = findViewById(R.id.resultBar);
        final EditText enterBar = findViewById(R.id.enterBar);
        final Button fakt = findViewById(R.id.butonFakt);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (enterBar.getText().toString().matches("" )){
                    enterBar.setHint("Enter Number!");
                }else {
                    resultBar.setText("");
                    number1 = Double.parseDouble(enterBar.getText().toString());
                    resultBar.setText(number1+resultBar.getText().toString());
                    enterBar.setText("");
                    operation = "+";
                }
            }
        });

        deduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (enterBar.getText().toString().matches("")){
                    enterBar.setHint("Enter Number!");
                }else {
                    resultBar.setText("");
                    number1 = Double.parseDouble(enterBar.getText().toString());
                    resultBar.setText(number1+resultBar.getText().toString());
                    enterBar.setText("");
                    operation = "-";
                }
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (enterBar.getText().toString().matches("")){
                    enterBar.setHint("Enter Number!");
                }else {
                    resultBar.setText("");
                    number1 = Double.parseDouble(enterBar.getText().toString());
                    resultBar.setText(number1+resultBar.getText().toString());
                    enterBar.setText("");
                    operation = "*";
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (enterBar.getText().toString().matches("")){
                    enterBar.setHint("Enter Number!");
                }else {
                    resultBar.setText("");
                    number1 = Double.parseDouble(enterBar.getText().toString());
                    resultBar.setText(number1+resultBar.getText().toString());
                    enterBar.setText("");
                    operation = "/";
                }
            }
        });

        fakt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (enterBar.getText().toString().matches("")){
                    enterBar.setHint("Enter Number!");
                    enterBar.setText("");
                }else {
                    int lastFakt = 1;
                    resultBar.setText("");
                    number1 = Integer.parseInt(enterBar.getText().toString());
                    for (int i = 1; i <= number1; i++) {
                        lastFakt = i * lastFakt;
                    }
                    resultBar.setText(lastFakt+resultBar.getText().toString());
                    enterBar.setText("");
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (enterBar.getText().toString().matches("")){
                    enterBar.setHint("Enter Number!");
                }else {

                number2 = Integer.parseInt(enterBar.getText().toString());

                switch (operation){
                    case "+":
                        number1 = Double.parseDouble(resultBar.getText().toString());
                        resultBar.setText("");
                        enterBar.setText("");
                        result=number1+number2;
                        break;
                    case "-":
                        number1 = Double.parseDouble(resultBar.getText().toString());
                        resultBar.setText("");
                        enterBar.setText("");
                        result=number1-number2;
                        break;
                    case "*":
                        number1 = Double.parseDouble(resultBar.getText().toString());
                        resultBar.setText("");
                        enterBar.setText("");
                        result=number1*number2;
                        break;
                    case "/":
                        number1 = Double.parseDouble(resultBar.getText().toString());
                        resultBar.setText("");
                        enterBar.setText("");
                        result=number1/number2;
                        break;
                }

                resultBar.setText(result+resultBar.getText().toString());
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterBar.setText("");
                resultBar.setText("");
            }
        });
    }
}