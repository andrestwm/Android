package com.example.bukuonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class Menu extends AppCompatActivity {

    private ViewFlipper viewFlipper;
    private Animation fadeIn, fadeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



                                          Intent i = new Intent(Menu.this, ListGame.class);
                                          startActivity(i);

                                          finish();


        viewFlipper = (ViewFlipper)findViewById(R.id.viewSlider);
        fadeIn = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        fadeOut = AnimationUtils.loadAnimation(this,R.anim.fade_out);
        viewFlipper.setAnimation(fadeIn);
        viewFlipper.setAnimation(fadeOut);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(6000);
        viewFlipper.startFlipping();


    }
}
