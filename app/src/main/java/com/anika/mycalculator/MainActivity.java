package com.anika.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //object declare
    TextView txtResult;
    EditText etNumber1,etNumber2;
    Button btnPlus,btnMinus,btnMulti,btnDivision,btnreset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult=findViewById(R.id.txt_result);
        etNumber1=findViewById(R.id.et_number1);
        etNumber2=findViewById(R.id.et_number2);

        btnPlus=findViewById(R.id.btn_plus);
        btnMinus=findViewById(R.id.btn_minus);
        btnMulti=findViewById(R.id.btn_multi);
        btnDivision=findViewById(R.id.btn_division);
        btnreset=findViewById(R.id.btn_reset);


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etNumber1.getText().toString();
                String number2=etNumber2.getText().toString();

                if(number1.isEmpty() || number2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "No chalaki..Plz input the number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double value1=Double.parseDouble(number1);
                    Double value2=Double.parseDouble(number2);

                    double result=value1+value2;

                    txtResult.setText(""+result);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etNumber1.getText().toString();
                String number2=etNumber2.getText().toString();

                if(number1.isEmpty() || number2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "No chalaki..Plz input the number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double value1=Double.parseDouble(number1);
                    Double value2=Double.parseDouble(number2);

                    double result=value1-value2;

                    txtResult.setText(""+result);
                }
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etNumber1.getText().toString();
                String number2=etNumber2.getText().toString();

                if(number1.isEmpty() || number2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "No chalaki..Plz input the number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double value1=Double.parseDouble(number1);
                    Double value2=Double.parseDouble(number2);

                    double result=value1*value2;

                    txtResult.setText(""+result);
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=etNumber1.getText().toString();
                String number2=etNumber2.getText().toString();

                if(number1.isEmpty() || number2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "No chalaki..Plz input the number", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Double value1=Double.parseDouble(number1);
                    Double value2=Double.parseDouble(number2);

                    double result=value1/value2;

                    txtResult.setText(""+result);
                }
            }
        });


        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("0");
                etNumber1.setText("");
                etNumber2.setText("");
            }
        });

        //this is update
    }
}
