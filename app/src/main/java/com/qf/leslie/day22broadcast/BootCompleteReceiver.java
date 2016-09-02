package com.qf.leslie.day22broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Leslie on 16-8-23.
 */
public class BootCompleteReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //通过intent来判断
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)){
            Toast.makeText(context,"欢迎欢迎人咧欢迎",Toast.LENGTH_SHORT).show();
            Log.d("leslie","欢迎欢迎特列欢迎");
        }
    }
}
