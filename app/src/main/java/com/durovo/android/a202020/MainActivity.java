package com.durovo.android.a202020;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.durovo.android.a202020.utils.AppNotification;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchNotification(View view) {
        AppNotification.buildNotification(this);
    }
}
