package com.example.registerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    private TextView name;
    private TextView age;
    private TextView birth;
    private TextView email;
    private TextView interest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        name = (TextView) findViewById(R.id.textView8);
        age = (TextView) findViewById(R.id.textView9);
        birth = (TextView) findViewById(R.id.textView10);
        email = (TextView) findViewById(R.id.textView11);
        interest = (TextView) findViewById(R.id.textView12);

        Intent intent = getIntent();
        name.setText("姓名："+ intent.getStringExtra("name"));
        age.setText("年龄："+intent.getStringExtra("age"));
        birth.setText("生日："+intent.getStringExtra("birth"));
        email.setText("邮箱："+intent.getStringExtra("email"));
        interest.setText("兴趣："+intent.getStringExtra("interest"));
    }
}