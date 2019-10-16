package com.example.user.number;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class number extends AppCompatActivity {

    EditText numb1, numb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        numb1 = findViewById(R.id.num1);
        numb2 = findViewById(R.id.num2);
    }

    public void onClick(View v){
        Intent i = new Intent(this, thisnumber.class);
        String number1 = numb1.getText().toString();
        String number2 = numb2.getText().toString();
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);
        i.putExtra("num1", n1);
        i.putExtra("num2", n2);
        startActivity(i);
    }
}
