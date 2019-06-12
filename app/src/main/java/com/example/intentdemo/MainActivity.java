package com.example.intentdemo;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mTextView1;
    TextView mTextView2;
    TextView mTextView3;
    TextView mTextView4;
    TextView mTextView5;
    TextView mTextView6;
    TextView mTextView7;
    TextView mTextView8;
    TextView mTextView9;
    TextView mTextView10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView1 = findViewById(R.id.componentName);
        mTextView2 = findViewById(R.id.intent);
        mTextView3 = findViewById(R.id.action);
        mTextView4 = findViewById(R.id.actionAndCategory);
        mTextView5 = findViewById(R.id.pickView);
        mTextView6 = findViewById(R.id.actionView);
        mTextView7 = findViewById(R.id.backHome);
        mTextView8 = findViewById(R.id.actionViewWebView);
        mTextView9 = findViewById(R.id.editPhoneNumner);
        mTextView10 = findViewById(R.id.callPhoneNumner);



        mTextView1.setOnClickListener(view -> {
            ComponentName componentName = new ComponentName(MainActivity.this, DemoActivity.class);
            Intent intent = new Intent();
            intent.setComponent(componentName);
            startActivity(intent);
        });

        mTextView2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, DemoActivity.class);
            startActivity(intent);
        });

        mTextView3.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setAction("hello");
            startActivity(intent);
        });

        mTextView4.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setAction("demo");
            intent.addCategory("demo-category");
            startActivity(intent);
        });

        mTextView5.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_PICK);
            intent.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);
            startActivity(intent);
        });
        mTextView6.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            startActivity(intent);
        });

        mTextView7.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            startActivity(intent);
        });

        mTextView8.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.baidu.com"));
            startActivity(intent);
        });

        mTextView9.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_EDIT);
            intent.setData(Uri.parse("content://com.android.contacts/contacts/xm"));
            startActivity(intent);
        });

        mTextView10.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:13800138000"));
            startActivity(intent);
        });
    }
}
