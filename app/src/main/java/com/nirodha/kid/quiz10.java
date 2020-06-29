package com.nirodha.kid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class quiz10 extends Activity {
    TextView q1,q2,q3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz10);
        q1 = (TextView) findViewById(R.id.q1);
        q2 = (TextView) findViewById(R.id.q2);
        q3 = (TextView) findViewById(R.id.q3);
    }

    public void river (View v){
        q1.setText("CORRECT !");
    }

    public void noriver(View v){
        q1.setText("TRY AGAIN !");
    }

    public void boat(View v){
        q2.setText("CORRECT !");
    }

    public void noboat(View v){
        q2.setText("TRY AGAIN !");
    }

    public void back(View v){
        Intent intent = new Intent(this,dashboard.class);
        startActivity(intent);
    }
}
