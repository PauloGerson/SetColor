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

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red = findViewById(R.id.red);
        yellow = findViewById(R.id.yellow);
        blue = findViewById(R.id.blue);


    onRadioButtonClicked(view);


        /*red.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                view1 = findViewById(R.id.view);
                view1.setBackgroundResource(R.color.red);
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {

                view1 = findViewById(R.id.view);
                view1.setBackgroundResource(R.color.yellow);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                    view1 = findViewById(R.id.view);
                    view1.setBackgroundResource(R.color.blue);
            }
        });*/




    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        view = findViewById(R.id.view);
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.red:
                if (checked)
                    // Pirates are the best
                //view.setBackgroundResource(R.color.red);

                    break;
            case R.id.blue:
                if (checked)
                    // Ninjas rule
                    //view.setBackgroundResource(R.color.blue);
                    break;
        }
    }
}