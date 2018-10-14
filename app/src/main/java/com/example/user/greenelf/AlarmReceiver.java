package com.example.user.greenelf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;

public class AlarmReceiver extends BroadcastReceiver {
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onReceive(Context context, Intent intent) {
        String chuoi = intent.getExtras().getString("extra");

        Intent MusicIntent = new Intent(context, AlarmMusic.class);
        MusicIntent.putExtra("extra", chuoi);
        context.startService(MusicIntent);
    }
}
