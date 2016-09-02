package com.qf.leslie.day22broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Administrator on 16-8-23.
 */
public class OrderReceiverSecond extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.qf.order")){
//            Bundle bundle=new Bundle();
//            bundle.putString("mmm","更改后的数据");
            //改变内容
//            setResultExtras(bundle);
            abortBroadcast();
            Toast.makeText(context,"第二个接受者",Toast.LENGTH_LONG).show();
        }
    }
}
