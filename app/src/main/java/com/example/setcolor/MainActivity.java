package com.example.setcolor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    RadioButton red, yellow, blue;

    SharedPreferences preferences;

    View view1;
    int colorDefault;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red = findViewById(R.id.red);
        yellow = findViewById(R.id.yellow);
        blue = findViewById(R.id.blue);

        view1 = findViewById(R.id.view);

        preferences = getSharedPreferences("arquivo", Context.MODE_PRIVATE);
        colorDefault = preferences.getInt("color", 0);
        view1.setBackgroundResource(colorDefault);



        red.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {


                int color1 = R.color.red;

                preferences = getSharedPreferences("arquivo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("color", color1);
                editor.commit();

                colorDefault = preferences.getInt("color", 0);
                view1.setBackgroundResource(color1);

            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {

                int color1 = R.color.yellow;

                preferences = getSharedPreferences("arquivo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("color", color1);
                editor.commit();

                colorDefault = preferences.getInt("color", 0);
                view1.setBackgroundResource(color1);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                int color1 = R.color.blue;

                preferences = getSharedPreferences("arquivo", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("color", color1);
                editor.commit();

                colorDefault = preferences.getInt("color", 0);
                view1.setBackgroundResource(color1);
            }
        });


    }


}