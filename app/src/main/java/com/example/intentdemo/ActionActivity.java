package com.example.intentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        setTitle("这是通过Action启动的Activity");
    }
}
