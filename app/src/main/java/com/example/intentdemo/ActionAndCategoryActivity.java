package com.example.intentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActionAndCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_and_category);

        setTitle("这是通过Action Category启动的Activity");
    }
}
