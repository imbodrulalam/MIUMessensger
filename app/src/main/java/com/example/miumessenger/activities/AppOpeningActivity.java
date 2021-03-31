package com.example.miumessenger.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.miumessenger.R;
import com.example.miumessenger.databinding.ActivityAppOppeningBinding;

public class AppOpeningActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN=6000;
    ActivityAppOppeningBinding binding;
    Animation bottomAnim, topAnim;
    ImageView image;
    TextView appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityAppOppeningBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        topAnim = AnimationUtils.loadAnimation(this, R.anim.anim_opening_top);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.anim_opening_bottom);
        image = findViewById(R.id.oppeningLogo);
        appName = findViewById(R.id.oppeningAppName);


        image.setAnimation(topAnim);
        appName.setAnimation(bottomAnim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(AppOpeningActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);



    }
}