package com.qf.leslie.day22broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 16-8-23.
 */
public class OrderReceiverFirst extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.qf.order")){
            String order=intent.getExtras().getString("order");
            Toast.makeText(context,order,Toast.LENGTH_SHORT).show();
        }
    }
}
