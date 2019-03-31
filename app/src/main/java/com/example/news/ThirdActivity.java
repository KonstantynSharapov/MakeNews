package com.example.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lesson","onPause3Act");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        final Button buttonThirdToFirst=findViewById(R.id.bt_button_t_to_f);
        buttonThirdToFirst.setText("Go to First Activity");
        buttonThirdToFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(ThirdActivity.this,MainActivity.class);
                startActivity(j);}});
        final Button buttonThirdToSecond=findViewById(R.id.bt_button_t_to_s);
        buttonThirdToSecond.setText("Go to Second Activity");
        buttonThirdToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(ThirdActivity.this,SecondActivity.class);
                startActivity(j);}});

        Log.d("lesson","onCreate3Act");
    }
}
