package com.qf.leslie.day22broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Administrator on 16-8-23.
 */
public class ScreenOnOffReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)){
            Log.d("leslie","屏幕亮了");
        }else if(intent.getAction().equals(Intent.ACTION_SCREEN_OFF)){
            Log.d("leslie","屏幕暗了");
    }

    }
}
