package com.durovo.android.a202020.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.firebase.jobdispatcher.JobParameters;
import com.firebase.jobdispatcher.JobService;

/**
 * Created by root on 2/2/17.
 */

public class AlarmReceiver extends JobService {


    @Override
    public boolean onStartJob(JobParameters job) {

        AppNotification.buildNotification(this);
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters job) {
        return true;
    }
}
