package com.example.news;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.user_name);
        String []names ={"Kostya, Ihor, Irina, Sharapov, privet , privet1 , privet 2, privet 3, privet4, privet5, the end!"};
        for(String nnn:names){
            list.append(nnn+"\n");}
        final Button button=findViewById(R.id.bt_button_f_to_s);
        button.setText("Go to Second Activity");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
        final Button buttontwo=findViewById(R.id.bt_button_f_to_t);
        buttontwo.setText("Go to Third Activity");
        buttontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("lesson"," вы нажали вторую кнопку в первой активити");
                Intent g=new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(g);
            }
        });


    }

}

