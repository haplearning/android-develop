package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Name;
    EditText Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.editTextTextPersonName);
        Pass = (EditText) findViewById(R.id.editTextTextPersonName2);
        Button Login = (Button) findViewById(R.id.button);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(Name.getText().toString().trim(),Pass.getText().toString().trim());
            }
        });
    }

    public void check(String name, String pass){
        if (name.equals("purifall")& pass.equals("123456")){
            Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this,"账号或密码错误",Toast.LENGTH_SHORT).show();
        }
    }
}