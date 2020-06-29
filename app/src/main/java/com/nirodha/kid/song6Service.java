
package com.nirodha.kid;

        import android.app.Service;
        import android.content.Intent;
        import android.icu.util.Measure;
        import android.media.MediaPlayer;
        import android.os.IBinder;

        import androidx.annotation.Nullable;

public class song6Service extends Service {


    MediaPlayer player;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        player = MediaPlayer.create(this,R.raw.song6);
        player.setLooping(true);
        player.setVolume(100,100);

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        player.start();
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
        player.release();
    }
}
