# android-develop
Some demos of android development

# 

# 前言

该项目是一个小白自学 android 开发 apk 练手的，参考文章：[《教我兄弟学Android逆向02 破解第一个Android程序 》 - 『移动安全区』 - 吾爱破解 - LCG - LSG |安卓破解|病毒分析|www.52pojie.cn](https://www.52pojie.cn/thread-650395-1-1.html)，只不过这个教程比较早，用的开发环境和工具都是老版本的，按照教程开发会有很多坑，这里用新版本新环境重新走一步，把遇到的坑记录下来：



# 开发环境

- Java：jdk-16.0.1
- Android_SDK：Android 11.0（R）
- Android studio 4.2.1
- 夜神模拟器 7.0.0.1



# 案例一：简单的登录校验 app

一个简单的的登录案例

输入账号和密码，点击登录，app 会校验账号和密码是否正确（源码中写死）

> 账号：purifall
>
> 密码：123456

正确则返回 “登录成功”，错误则返回 “账号或密码错误”

新建项目：

![image-20210606191132651](https://github.com/haplearning/android-develop/blob/main/images/image-20210606191132651.png)

选择 `Phone and Tablet`，`Empty Activity`

![image-20210606191251357](https://github.com/haplearning/android-develop/blob/main/images/image-20210606191251357.png)



输入app 信息，点击 `Finish` 创建

![image-20210606192030397](https://github.com/haplearning/android-develop/blob/main/images/image-20210606192030397.png)



创建后项目目录如下：

![image-20210606193455736](https://github.com/haplearning/android-develop/blob/main/images/image-20210606193455736.png)![image-20210606193928952](https://github.com/haplearning/android-develop/blob/main/images/image-20210606193928952.png)



首先配置界面信息，配置界面可以编写 xml 代码配置，也可以通过鼠标拖动界面元素来设计

这里添加了两个文本框 `TextView`，两个 输入框 `PlainText`，一个按钮 `Button`，这里需要记住 id，主程序会用到

![](https://github.com/haplearning/android-develop/blob/main/images/image-20210606211913297.png)



编写主程序 `MainActivity`，所需知识点：

- `findViewById`：通过id 获取元素
- `setOnClickListener`：设置按键监听

```java
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Name;
    EditText Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //通过id 获取元素
        Name = (EditText) findViewById(R.id.editTextTextPersonName);
        Pass = (EditText) findViewById(R.id.editTextTextPersonName2);
        Button Login = (Button) findViewById(R.id.button);
        //绑定点击事件
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //调用校验函数
                check(Name.getText().toString().trim(),Pass.getText().toString().trim());
            }
        });
    }

    public void check(String name, String pass){
        //校验函数，判断账号密码是否是 purifall 123456
        if (name.equals("purifall")& pass.equals("123456")){
            Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this,"账号或密码错误",Toast.LENGTH_SHORT).show();
        }
    }
}
```

之后点击 `Build-Build Bundle(s)/APK(s)-Build APK(s)` 编译

![image-20210606204944977](https://github.com/haplearning/android-develop/blob/main/images/image-20210606204944977.png)

编译成功后提示：

![image-20210606205314968](https://github.com/haplearning/android-develop/blob/main/images/image-20210606205314968.png)

apk 文件保存在项目目录下的 `\app\build\outputs\apk\debug` 文件夹中

打开模拟器安装尝试登录

输入 `purifall`、`123456`

![image-20210606210900491](https://github.com/haplearning/android-develop/blob/main/images/image-20210606210900491.png)

输入其他：

![image-20210606211012255](https://github.com/haplearning/android-develop/blob/main/images/image-20210606211012255.png)

# 案例二：简单的登录跳转 app
