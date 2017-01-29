package com.durovo.android.a202020.utils;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.NotificationCompat;

import com.durovo.android.a202020.MainActivity;
import com.durovo.android.a202020.R;
import com.durovo.android.a202020.TimerActivity;

/**
 * Created by root on 29/1/17.
 */

public class AppNotification {
    private final static int PENDING_INTENT_ID = 22;
    private final static int NOTIFICATION_ID = 133;

    public static void buildNotification(Context context) {
        NotificationManager notificationManager = (NotificationManager)
                context.getSystemService(context.NOTIFICATION_SERVICE);
        Notification notification = new NotificationCompat.Builder(context)
                .setContentIntent(buildPendingIntent(context))
                .setAutoCancel(true)
                .setDefaults(Notification.DEFAULT_VIBRATE)
                .setContentTitle("It is time to look outside")
                .setContentText("Tap here to start Timer")
                .setStyle(new NotificationCompat.BigTextStyle().bigText("Tap here to start Timer"))
                .setSmallIcon(R.drawable.ic_stat_name)
                .build();
        notificationManager.notify(NOTIFICATION_ID, notification);
    }

    private static PendingIntent buildPendingIntent(Context context) {
        Intent launchTimerIntent = new Intent(context, TimerActivity.class);
        PendingIntent launchTimerPI = PendingIntent.getActivity(context,PENDING_INTENT_ID,
                launchTimerIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        return launchTimerPI;
    }
}
