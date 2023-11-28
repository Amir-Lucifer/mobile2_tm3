package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TextActivity extends AppCompatActivity {
        EditText text5;
        int j = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        text5 = (EditText) findViewById(R.id.text5);
        Button Enter =(Button) findViewById(R.id.Enter);
        TextView list_r = (TextView) findViewById(R.id.list_r);

        ArrayList<String> list = new ArrayList<>() ;

        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String A = text5.getText().toString();
                String B = "" ;

                list.add(j+"."+A);

                for (int C = 0; C<list.size(); C++){
                    B+=list.get(C)+"/n";
                }
                list_r.setText(B.toString());
                j++;
                text5.setText("");
            }
        });
    }
}