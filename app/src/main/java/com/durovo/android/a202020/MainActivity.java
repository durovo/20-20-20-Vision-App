package com.durovo.android.a202020;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.durovo.android.a202020.utils.AppNotification;
import com.durovo.android.a202020.utils.JobBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startJob(View view) {
        JobBuilder.buildJob(this);
    }
}
