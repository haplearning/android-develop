package com.example.registerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    private TextView name;
    private TextView age;
    private TextView birth;
    private TextView email;
    private TextView interest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = (EditText) findViewById(R.id.editTextTextPersonName);
        age = (EditText) findViewById(R.id.editTextTextPersonName2);
        birth = (EditText) findViewById(R.id.editTextTextPersonName5);
        email = (EditText) findViewById(R.id.editTextTextPersonName6);
        interest = (EditText) findViewById(R.id.editTextTextPersonName7);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, ShowActivity.class);
                intent.putExtra("name",name.getText().toString());
                intent.putExtra("age",age.getText().toString());
                intent.putExtra("birth",birth.getText().toString());
                intent.putExtra("email",email.getText().toString());
                intent.putExtra("interest",interest.getText().toString());
                startActivity(intent);
            }
        });

    }
}