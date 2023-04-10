package com.example.quipapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity3 extends AppCompatActivity {
    TextView outputView;
    int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resul3);

        Intent myGetIntent = getIntent();

//        value = myGetIntent.getIntExtra("finalScore",0);
        value=getIntent().getIntExtra(MainActivity2.finalResult,0);
        outputView=findViewById(R.id.outputViewId);
        outputView.setText("values:"+value);
    }

    public void tryFunction(View view) {
        Intent myIntent = new Intent(this,MainActivity.class);
        startActivity(myIntent);
    }
}