
package com.nirodha.kid;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;

        import androidx.annotation.Nullable;

public class song6 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song6);
    }


    public void play(View v)
    {
        Intent intent = new Intent(this,song6Service.class);
        startService(intent);
    }

    public void stop (View v)
    {
        Intent intent = new Intent(this,song6Service.class);
        stopService(intent);
    }

    public void quiz6(View v)
    {
        Intent intent = new Intent(this,quiz6.class);
        startActivity(intent);
    }
}
