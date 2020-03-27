package com.kellydouglass.activitymovement;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class Activity5 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        Bundle bundle = getIntent().getExtras();

        textView = findViewById(R.id.act5TextView);

        textView.setText(bundle.getString("EXTRA_1"));


    }
}
