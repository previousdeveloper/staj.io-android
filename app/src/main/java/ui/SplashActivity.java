package ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import io.staj.stajio.R;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

/**
 * Created by gokhan on 4/7/15.
 */

@ContentView(R.layout.activity_splash_screen)
public class SplashActivity extends ActionBarActivity {

    private Animation animation;
    private Handler handler;
    private Runnable runnable;


    @InjectView(R.id.logo_img)
    ImageView logoImage;


    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        animation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        logoImage.startAnimation(animation);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        handler.postDelayed(runnable, 3000L);
    }

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable);


    }
}
