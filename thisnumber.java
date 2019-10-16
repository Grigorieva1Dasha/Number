package com.example.user.number;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class thisnumber extends AppCompatActivity {

    int n1, n2;
    int mid;
    TextView thisnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thisnumber);
        Intent i = getIntent();
        thisnum = findViewById(R.id.ifnumber);
        n1 = i.getIntExtra("num1", -1);
        n2 = i.getIntExtra("num2", -1);
        mid = n1 + (n2 - n1) / 2;
        thisnum.setText("Ваше число >=" + mid + "?");
    }

    public void onClick(View v){
        if (v.getId() == R.id.yes){
            n1 = mid + 1;
        }
        if (v.getId() == R.id.no && (n2 - n1) != 1){
            n2 = mid;
        }
        if (n2 != n1){
            mid = n1 + (n2 - n1) / 2;
            thisnum.setText("Ваше число >=" + mid + "?");
        }
        else{
            thisnum.setText("Вы загадали " + mid);
        }
    }
}
