package com.kellydouglass.activitymovement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        Button button = findViewById(R.id.toActivity5Button);
        final EditText editText = findViewById(R.id.act4EditText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity4.this, Activity5.class);
                intent.putExtra("EXTRA_1", editText.getText().toString());
                startActivity(intent);
            }
        });
    }
}
