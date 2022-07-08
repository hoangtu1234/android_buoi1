package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen2Activity extends AppCompatActivity {
    private Button btnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        initView();
        btnButton.setOnClickListener(view -> {
            Intent intent = new Intent(this,Screen3Activity.class);
            startActivity(intent);
        });
    }
    private void initView(){
        btnButton = findViewById(R.id.btnButton);
    }
}