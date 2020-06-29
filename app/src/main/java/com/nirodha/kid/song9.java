package com.nirodha.kid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class song9 extends Activity
{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song9);
    }


    public void play(View v)
    {
        Intent intent = new Intent(this,song9Service.class);
        startService(intent);
    }

    public void stop (View v)
    {
        Intent intent = new Intent(this,song9Service.class);
        stopService(intent);
    }

    public void quiz9(View v)
    {
        Intent intent = new Intent(this,quiz9.class);
        startActivity(intent);
    }
}
