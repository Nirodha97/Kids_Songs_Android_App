package com.nirodha.kid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class dashboard extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard1);
    }


    public void openSong1(View v){
        Intent intent = new Intent(this,song1.class);
        startActivity(intent);
    }

    public void openSong2(View v){
        Intent intent = new Intent(this,song2.class);
        startActivity(intent);
    }
    public void openSong3(View v){
        Intent intent = new Intent(this,song3.class);
        startActivity(intent);
    }

    public void openSong4(View v){
        Intent intent = new Intent(this,song4.class);
        startActivity(intent);
    }

    public void openSong5(View v){
        Intent intent = new Intent(this,song5.class);
        startActivity(intent);
    }

    public void openSong6(View v){
        Intent intent = new Intent(this,song6.class);
        startActivity(intent);
    }
    public void openSong7(View v){
        Intent intent = new Intent(this,song7.class);
        startActivity(intent);
    }
    public void openSong8(View v){
        Intent intent = new Intent(this,song8.class);
        startActivity(intent);
    }
    public void openSong9(View v){
        Intent intent = new Intent(this,song9.class);
        startActivity(intent);
    }
    public void openSong10(View v){
        Intent intent = new Intent(this,song10.class);
        startActivity(intent);
    }
}
