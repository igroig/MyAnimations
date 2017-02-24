package com.example.gadeishvili.myanimations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SeventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        overridePendingTransition(R.anim.scale_out_from_zero, R.anim.static_state);
    }


    public void goTo(View view) {
        startActivity(new Intent(this, EitthActivity.class));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.static_state, R.anim.scale_in_to_zero);


    }



}
