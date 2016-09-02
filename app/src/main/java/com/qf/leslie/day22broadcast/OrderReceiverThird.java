package com.qf.leslie.day22broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 16-8-23.
 */
public class OrderReceiverThird extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.qf.order")){
            //取传递过来的值
            String resultString= getResultExtras(true).getString("mmm");
            Toast.makeText(context,resultString,Toast.LENGTH_LONG).show();
        }
    }
}
