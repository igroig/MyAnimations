package com.example.gadeishvili.myanimations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    private TextView tvRotate;
    private TextView tvScale;
    private TextView tvSlide;
    private TextView tvFade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        tvRotate = (TextView) findViewById(R.id.tvRotate);
        tvScale = (TextView) findViewById(R.id.tvScale);
        tvSlide = (TextView) findViewById(R.id.tvSlide);
        tvFade = (TextView) findViewById(R.id.tvFade);



    }

    public void goTo(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }

    public void rotate(View view) {
        Animation rotateAnimation = AnimationUtils.loadAnimation(this,R.anim.rotate);
        tvRotate.startAnimation(rotateAnimation);
    }

    public void scale(View view) {
        Animation scaleAnimation = AnimationUtils.loadAnimation(this,R.anim.scale_in);
        tvScale.startAnimation(scaleAnimation);    }

    public void slide(View view) {
        Animation slideAnimation = AnimationUtils.loadAnimation(this,R.anim.left_to_roght);
        tvSlide.startAnimation(slideAnimation);    }

    public void fade(View view) {
        Animation fadeAnimation = AnimationUtils.loadAnimation(this,R.anim.fade_out);
        tvFade.startAnimation(fadeAnimation);    }

}
