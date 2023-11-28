package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Log_InActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        EditText username =(EditText) findViewById(R.id.username);
        EditText password =(EditText) findViewById(R.id.password);
        Button btn =(Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin")&&password.getText().toString().equals("1234")){
                    Intent i=new Intent(Log_InActivity.this,CalculatorActivity.class);
                    startActivity(i);
                } else if (username.getText().toString().equals("")&&password.getText().toString().equals("")) {
                    Toast.makeText(Log_InActivity.this, "fill in the blanks", Toast.LENGTH_SHORT).show();

                } else if (username.getText().toString().equals("ali")&&password.getText().toString().equals("1100")) {
                   Intent h = new Intent(Log_InActivity.this,TextActivity.class);
                   startActivity(h);
                }else{
                    Toast.makeText(Log_InActivity.this, "USERNAME OR PASSWORD ISNOT CORRECT", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}