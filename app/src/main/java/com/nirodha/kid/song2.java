package com.nirodha.kid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class song2 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song2);
    }


    public void play(View v)
    {
        Intent intent = new Intent(this,song2Service.class);
        startService(intent);
    }

    public void stop (View v)
    {
        Intent intent = new Intent(this,song2Service.class);
        stopService(intent);
    }
    public void quiz2(View v)
    {
        Intent intent = new Intent(this,quiz2.class);
        startActivity(intent);
    }
}
