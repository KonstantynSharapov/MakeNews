package com.example.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lesson","onPause2Act");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        final Button buttonSecondToFirst=findViewById(R.id.bt_button_s_to_f);
        buttonSecondToFirst.setText("Go to First Activity");
        buttonSecondToFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(h);
            }
        });
        final Button buttonSecond=findViewById(R.id.bt_button_s_to_t);
        buttonSecond.setText("Go to Third Activity");
        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(f);
            }
        });

        Log.d("lesson","onCreate2Act");
    }

}
