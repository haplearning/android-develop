package com.example.registerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
//    EditText Name;
//    EditText Pass;
    TextView name;
    TextView age;
    TextView birth;
    TextView email;
    TextView interest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Name = (EditText) findViewById(R.id.editTextTextPersonName);
//        Pass = (EditText) findViewById(R.id.editTextTextPersonName2);
        name = (EditText) findViewById(R.id.editTextTextPersonName);
        age = (EditText) findViewById(R.id.editTextTextPersonName2);
        birth = (EditText) findViewById(R.id.editTextTextPersonName5);
        email = (EditText) findViewById(R.id.editTextTextPersonName6);
        interest = (EditText) findViewById(R.id.editTextTextPersonName7);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                check(Name.getText().toString().trim(), Pass.getText().toString().trim());
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name",name.getText().toString());
                intent.putExtra("age",age.getText().toString());
                intent.putExtra("birth",birth.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("interest",interest.getText().toString());
                startActivity(intent);
            }
        });
    }

//    public void check(String name, String pass){
//        if (name.equals("purifall") & pass.equals("123456")){
//            Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
//        } else{
//            Toast.makeText(MainActivity.this, "账号或密码错误", Toast.LENGTH_SHORT).show();
//        }
//    }

}