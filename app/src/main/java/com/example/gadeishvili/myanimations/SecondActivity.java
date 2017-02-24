package com.example.gadeishvili.myanimations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        overridePendingTransition(R.anim.scale_out_from_zero, R.anim.static_state);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.left_to_roght, R.anim.right_to_right);
    }

    public void goTo(View v){
        startActivity(new Intent(this, ThierdActivity.class));

    }
}
