package com.qf.leslie.day22broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Administrator on 16-8-23.
 */
public class PowerStateRecevier extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //监听电源插拔以及电量变化
        switch (intent.getAction()){

            case Intent.ACTION_POWER_CONNECTED:
                Toast.makeText(context,"电源连接了",Toast.LENGTH_SHORT).show();
                Log.d("lelsie","电源连接了");
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                Log.d("lelsie","电源断开了");
                break;
            case Intent.ACTION_BATTERY_CHANGED:
                Log.d("leslie","电量变化了");
                break;
        }
    }
}
