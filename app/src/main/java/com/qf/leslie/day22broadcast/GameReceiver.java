package com.qf.leslie.day22broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 16-8-23.
 */
public class GameReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals("com.qf.game")){

            String name=intent.getExtras().getString("name");
            Toast.makeText(context,"接收到了游戏的广播"+name,Toast.LENGTH_SHORT).show();
        }
    }
}
