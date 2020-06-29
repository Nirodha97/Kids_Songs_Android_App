package com.nirodha.kid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class quiz2 extends Activity {

    TextView q1,q2,q3;
    Button r1,g1;
    int i=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz2);
        q1=(TextView) findViewById(R.id.q1);
        q2=(TextView) findViewById(R.id.q2);
        q3=(TextView) findViewById(R.id.q3);
        r1=(Button)findViewById(R.id.r1);
        g1=(Button)findViewById(R.id.g1);
    }

    public void bed(View v){
        q1.setText("CORRECT !");
    }

    public void nobed(View v){
        q1.setText("TRY AGAIN !");
    }

    public void six(View v){
        q2.setText("CORRECT !");
    }

    public void nosix(View v){
        q2.setText("TRY AGAIN !");
    }

    public void red(View v){
        i++;
        Button r1 = (Button)v;
        if(i==8){
            r1.setText(""+i);
        }
        else
        {
            r1.setText("");
        }


    }



    public void green(View v){
        if(i==8){
            q3.setText("CORRECT !");
        }

        else
        {
            q3.setText("TRY AGAIN !");
        }
    }

    public void back(View v){
        Intent intent = new Intent(this,dashboard.class);
        startActivity(intent);
    }
}
