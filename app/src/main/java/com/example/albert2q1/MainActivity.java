package com.example.albert2q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txtV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        txtV = findViewById(R.id.txtV);
    }

    public void lol(View view) {
        btn = findViewById(R.id.btn);
        txtV.setText("oh yeah ive been clicked! ");
    }
}