package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        EditText number1 =(EditText) findViewById(R.id.number1);
        EditText number2 =(EditText) findViewById(R.id.number2);
        Button    sum    =(Button)  findViewById(R.id.sum);
        Button    min    =(Button)  findViewById(R.id.min);
        Button  taghsim  =(Button)  findViewById(R.id.taghsim);
        TextView result  =(TextView) findViewById(R.id.result);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();

                if (num1.equals("")){
                    result.setText("please enter your number1");
                    return;
                }
                if (num2.equals("")){
                    result.setText("please enter your number2");
                }
                int x1=Integer.parseInt(num1);
                int x2=Integer.parseInt(num2);
                int sum = x1+x2;
                result.setText(sum+"");
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();

                if (num1.equals("")){
                    result.setText("please enter your number1");
                    return;
                }
                if (num2.equals("")){
                    result.setText("please enter your number2");
                }
                int x1=Integer.parseInt(num1);
                int x2=Integer.parseInt(num2);
                int min = x1-x2;
                result.setText(min+"");
            }
        });
        taghsim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = number1.getText().toString();
                String num2 = number2.getText().toString();

                if (num1.equals("")){
                    result.setText("please enter your number1");
                    return;
                }
                if (num2.equals("")){
                    result.setText("please enter your number2");
                }
                int x1=Integer.parseInt(num1);
                int x2=Integer.parseInt(num2);
                int taghsim = x1/x2;
                result.setText(taghsim+"");
            }
        });
    }
}