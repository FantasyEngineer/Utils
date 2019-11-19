package com.jimmy.utils;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.jimmy.tool.ClipboardUtils;
import com.jimmy.tool.ColorUtils;
import com.jimmy.tool.SnackbarUtils;
import com.jimmy.tool.ToastUtils;

public class MainActivity extends AppCompatActivity {

    private View mContentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContentView = LayoutInflater.from(this).inflate(R.layout.activity_main, null);
        findViewById(R.id.tv_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                ToastUtils.setBgColor(getResources().getColor(R.color.colorAccent));
//                ToastUtils.showShort("this is a test notification~");
//                LogUtils.a("this is a test notification~");
//                LogUtils.file("this is a test notification~");
//                SPUtils.getInstance().put("12312", "234123");

//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        String s = HttpsUtil.getForm("start=0&count=1", "https://douban.uieee.com/v2/movie/in_theaters");
//                        LogUtils.a(s);
//                    }
//                }).start();
                ClipboardUtils.copyText("123123123");
                ToastUtils.showShort("黏贴成功");
            }
        });
        findViewById(R.id.show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View snackBarRootView = findViewById(android.R.id.content);
                SnackbarUtils.with(snackBarRootView)
                        .setMessage("nihao")
                        .setBgColor(ColorUtils.getRandomColor(true))
                        .setDuration(SnackbarUtils.LENGTH_LONG)
                        .show();

            }
        });

    }
}
