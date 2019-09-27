package com.jimmy.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.jimmy.tool.LogUtils;
import com.jimmy.tool.ToastUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtils.setBgColor(getResources().getColor(R.color.colorAccent));
                ToastUtils.showShort("this is a test notification~");
                LogUtils.a("this is a test notification~");
            }
        });


    }
}
