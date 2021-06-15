package com.example.smalilog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = "丑小鸭";
        switch (name){
            case "丑小鸭":
                Log.i("hello","会飞的丑小鸭");
                break;
            case "小天鹅":
                Log.i("hello","会飞的小天鹅");
                break;
            case "唐老鸭":
                Log.i("hello","会飞的唐老鸭");
                break;
            default:
                Log.i("hello","没有符合的 name 值");
                break;
        }

    }
}