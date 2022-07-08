package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        initView();
        btnButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, Screen2Activity.class);
            startActivity(intent);
        });
    }

    private void initView() {
        btnButton = findViewById(R.id.btnButton);
    }
}