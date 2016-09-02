package com.qf.leslie.day22broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/**
 * Created by Administrator on 16-8-23.
 */
public class ConnectiveReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //监听网路状态
        if (intent.getAction().equals(ConnectivityManager.CONNECTIVITY_ACTION)){
            //获取系统网络状态的管理器
            ConnectivityManager manager= (ConnectivityManager)
                    context.getSystemService(Context.CONNECTIVITY_SERVICE);

            NetworkInfo mobileInfo=manager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            NetworkInfo wifiInfo=manager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            NetworkInfo activeInfo=manager.getActiveNetworkInfo();

            if (mobileInfo.isConnected()){
                Log.d("leslie","你连接的是"+mobileInfo.getTypeName());
            }

            if (wifiInfo.isConnected()){
                Log.d("leslie","你连接的是"+wifiInfo.getTypeName());
            }

            if (activeInfo.isConnected()){
                Log.d("leslie","你连接的是"+activeInfo.getTypeName());
            }
    }
    }
}
