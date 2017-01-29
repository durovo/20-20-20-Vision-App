package com.durovo.android.a202020.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by root on 29/1/17.
 */

public class AppPreferences {

    private static final String STATE_KEY = "state-key";
    //true denotes that the timer is on
    public static boolean getState(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPreferences.getBoolean(STATE_KEY, false);
    }

    public static void setStoppedTimer(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        sharedPreferences.edit().putBoolean(STATE_KEY, false);
    }

    public static void setRunningTimer(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        sharedPreferences.edit().putBoolean(STATE_KEY, true);
    }
}
