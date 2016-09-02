package com.qf.leslie.day22broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Administrator on 16-8-23.
 */
public class CallStateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //监听来电的状态
        if (intent.getAction().equals(Intent.ACTION_NEW_OUTGOING_CALL)){
            Log.d("lelsie","电话播出了啊");
        }else if (intent.getAction().equals("android.intent.action.PHONE_STATE")){
            Bundle bundle=intent.getExtras();//拿到intent携带的bundle
            String keyNum= TelephonyManager.EXTRA_INCOMING_NUMBER;
            String phoneNum=bundle.getString(keyNum);

            //获取系统电话管理的服务
            TelephonyManager manager= (TelephonyManager)
                    context.getSystemService(Context.TELEPHONY_SERVICE);
            int state=manager.getCallState();
            switch (state){
                case TelephonyManager.CALL_STATE_IDLE:
                    Toast.makeText(context,"挂断了电话",Toast.LENGTH_SHORT);
                    break;
                case TelephonyManager.CALL_STATE_OFFHOOK:
                    Toast.makeText(context,"接听电话",Toast.LENGTH_SHORT);
                    break;
                case TelephonyManager.CALL_STATE_RINGING:
                    Toast.makeText(context,"正在来电",Toast.LENGTH_SHORT);
                    break;
            }
        }

    }
}
