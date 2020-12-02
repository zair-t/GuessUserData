package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText password;
    private EditText login;
    private Button check;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.password = findViewById(R.id.editTextTextPassword);
        this.login = findViewById(R.id.editTextTextEmailAddress);
        this.check = findViewById(R.id.button);
        this.textView = findViewById(R.id.textView);
        check.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String cl = "1";
        String cp = "1";
        String t1 = login.getText().toString();
        String t2 = password.getText().toString();
        if(cl.equals(t1) && cp.equals(t2)){
            textView.setTextColor(Color.parseColor("#00FF00"));
            textView.setText(getResources().getString(R.string.right));
        }
        else{
            textView.setTextColor(Color.parseColor("#FF0000"));
            textView.setText(getResources().getString(R.string.no));
        }
    }
}