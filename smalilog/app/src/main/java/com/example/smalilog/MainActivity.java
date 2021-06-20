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
        fun1();
        fun2();
        fun3();
        Log.i("这个值是",String.valueOf(fun1()));
    }

    public int fun1(){
        int value = Test.value; //888
        return value;
    }
    public int fun2(){
        int value2 = Test.value2; //777
        return value2;
    }

    public String fun3(){
        String str = Test.str; //www.52pojie.cn
        String str2 = Test.str2; //码完代码去看东方明珠
        int value3 = Test.value3; //666
        return str2;
    }
}