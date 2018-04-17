package br.com.fiap.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    NotificationManager mNotificationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setContentTitle(getString(R.string.notificacao));
        builder.setContentText(getString(R.string.notification));
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentIntent(
                PendingIntent.getActivity(
                    this,
                    0,
                     new Intent(this, MainActivity.class), PendingIntent.FLAG_UPDATE_CURRENT));


        Notification notification = builder.build();

        //builder.setOngoing(true); não deixa a notificacao fechar
        notification.vibrate = new long[]{150, 300, 150, 600};
        mNotificationManager.notify(100, notification);
    }
}
