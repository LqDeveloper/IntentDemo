package com.example.intentdemo;

import android.content.ComponentName;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DemoActivity extends AppCompatActivity {
    TextView mPackName;
    TextView mClassName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        mPackName = findViewById(R.id.packageName);
        mClassName = findViewById(R.id.className);

        ComponentName componentName = getIntent().getComponent();

        mPackName.setText(componentName.getPackageName());
        mClassName.setText(componentName.getClassName());
    }
}
