package com.example.screens;

import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("Hello");
            int number = extras.getInt("1000");
            TextView textView = findViewById(R.id.textView);
            TextView textView2 = findViewById(R.id.textView2);
            textView.setText(name);
            textView.setText("" + number);


        }

    }
}