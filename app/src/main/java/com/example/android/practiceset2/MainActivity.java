package com.example.android.practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int healthLevel;
    String message;

    public void yes(View view) {
        healthLevel = healthLevel + 1;
        message = "You answered yes, current health level is " + healthLevel;
        display(message);
    }

    public void no(View view) {
        healthLevel = healthLevel - 1;
        message = "You answered no, current health level is " + healthLevel;
        display(message);
    }

    public void sometimes(View view) {
        healthLevel = healthLevel + 0;
        message = "You answered sometimes, current health level is " + healthLevel;
        display(message);
    }

    public void display (String i) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(""+i);
    }
}