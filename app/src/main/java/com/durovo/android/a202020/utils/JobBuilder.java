package com.durovo.android.a202020.utils;

import android.content.Context;

import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import com.firebase.jobdispatcher.GooglePlayDriver;
import com.firebase.jobdispatcher.Job;
import com.firebase.jobdispatcher.JobTrigger;
import com.firebase.jobdispatcher.RetryStrategy;
import com.firebase.jobdispatcher.Trigger;

/**
 * Created by root on 2/2/17.
 */

public class JobBuilder {
    private static final String JOB_TAG = "20-20-20-job";
    public static void buildJob(Context context) {
        FirebaseJobDispatcher jobDispatcher = new FirebaseJobDispatcher(new GooglePlayDriver(context));
        Job job = jobDispatcher.newJobBuilder()
                .setTag(JOB_TAG)
                .setService(AlarmReceiver.class)
                .setRecurring(false)
                .setReplaceCurrent(true)
                .setRetryStrategy(RetryStrategy.DEFAULT_EXPONENTIAL)
                .setTrigger(Trigger.executionWindow(60, 120))
                .build();
    }
}
