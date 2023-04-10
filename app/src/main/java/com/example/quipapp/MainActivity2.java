package com.example.quipapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {
    int temp,finalScore;
    RadioGroup q2Radio;
    public static String finalResult ="marks";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        q2Radio = findViewById(R.id.q2Radiogrp);

        Intent intent = getIntent();
        temp = intent.getIntExtra("score",0);
        finalScore = temp;

        System.out.println("Temp" + temp);

    }
    public void q2RadioFunction(View view) {
        if(q2Radio.getCheckedRadioButtonId()==R.id.radioButtonQ1){
            finalScore=temp+5;
        }

    }
    public void q2PreFunction(View view) {
        Intent myIntent=new Intent(this,MainActivity.class);

        startActivity(myIntent);
    }
    public void q2NextFunction(View view) {
        Intent myIntent=new Intent(this, ResultActivity3.class);
        if(q2Radio.getCheckedRadioButtonId()==R.id.radioButtonQ1){
            finalScore=temp+5;
        }
        myIntent.putExtra("score", finalScore);

        startActivity(myIntent);
    }
}