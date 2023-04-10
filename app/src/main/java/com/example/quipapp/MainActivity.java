package com.example.quipapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    RadioGroup q1Radio;
    public static String q1="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q1Radio=findViewById(R.id.q1RadioGrp);
    }

    public void q1RadioFunction(View view) {
        if(q1Radio.getCheckedRadioButtonId()==R.id.radioButton3Q1){
            score=5;
        }
    }


    public void q1NextFunction(View view) {
        if(q1Radio.getCheckedRadioButtonId()==R.id.radioButton3Q1){
            score=5;
        }

        Intent myIntent=new Intent(this,MainActivity2.class);
        myIntent.putExtra("score",score);
        startActivity(myIntent);
    }

    public void q1subFunction(View view) {

        if(q1Radio.getCheckedRadioButtonId()==R.id.radioButton3Q1){
            score=5;
        }

        Intent myIntent=new Intent(this,ResultActivity3.class);

        myIntent.putExtra("score",score);
        startActivity(myIntent);
    }



}