package com.example.administrator.myviewshizhong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textview1= (TextView) findViewById(R.id.textview1);
        Intent intent = getIntent();
        String chuan = intent.getStringExtra("chuan");
        textview1.setText(chuan);

    }
}
