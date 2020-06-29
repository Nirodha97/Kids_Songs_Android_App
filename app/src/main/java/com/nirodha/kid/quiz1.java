package com.nirodha.kid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;



public class quiz1 extends Activity {

    TextView q1,q2,q3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1);
        q1=(TextView) findViewById(R.id.q1);
        q2=(TextView) findViewById(R.id.q2);
        q3=(TextView) findViewById(R.id.q3);
    }

    public void duck(View v){
        q1.setText("CORRECT !");
    }

    public void noduck(View v){
        q1.setText("TRY AGAIN !");
    }

    public void hill(View v){
        q2.setText("CORRECT !");
    }

    public void tree(View v){
        q2.setText("TRY AGAIN !");
    }

    public void two(View v){
        q3.setText("CORRECT !");
    }

    public void wrong(View v){
        q3.setText("TRY AGAIN !");
    }


    public void back(View v){
        Intent intent = new Intent(this,dashboard.class);
        startActivity(intent);



    }





}
