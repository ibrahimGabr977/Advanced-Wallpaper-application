package com.gabr.ibrahim.mohammedsalahthebestofenglandpro;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        final MediaPlayer mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.fans);
        mediaPlayer.start();
        final Intent MyIntent=new Intent(this,Main2Activity.class);
        Handler mHand =new Handler();
        mHand.postDelayed(new Runnable() {
            @Override
            public void run() {
                mediaPlayer.stop();
                startActivity(MyIntent);

            }
        },3000L);
    }



}
