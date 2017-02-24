package com.example.gadeishvili.myanimations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class NinthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);


        overridePendingTransition(R.anim.scale_out, R.anim.static_state);
    }



}
