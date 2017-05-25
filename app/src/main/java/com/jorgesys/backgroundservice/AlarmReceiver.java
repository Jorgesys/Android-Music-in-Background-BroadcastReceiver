package com.jorgesys.backgroundservice;

import android.app.*;
import android.content.*;
import android.os.*;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent background = new Intent(context, BackgroundSoundService.class);
        context.startService(background);
    }

}