package com.jimmy.utils.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.hjg.top.TaskWindowManage;
import com.jimmy.utils.MainActivity;
import com.jimmy.utils.R;

public class SystemDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_dialog);

    }

    public void open(View view) {
        TaskWindowManage.INSTANCE.ShowInApplication(SystemDialogActivity.this);
    }

}
