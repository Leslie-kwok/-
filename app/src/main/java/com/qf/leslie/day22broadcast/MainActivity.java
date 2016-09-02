package com.qf.leslie.day22broadcast;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ScreenOnOffReceiver screenOnOffReceiver;//定义广播接收器
    ConnectiveReceiver connectiveReceiver;//定义监听网络状态的receiver变量

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //动态注册广播接收器，使用IntentFilter来添加过滤
      screenOnOffReceiver=new ScreenOnOffReceiver();
        IntentFilter filter=new IntentFilter();
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        filter.addAction(Intent.ACTION_SCREEN_ON);
        registerReceiver(screenOnOffReceiver,filter); //注册


        connectiveReceiver=new ConnectiveReceiver();
        IntentFilter filter1=new IntentFilter();
        //监听网络的intentaction
        filter1.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(connectiveReceiver,filter1);
    }

    public void sendBroadcast(View view){

        Intent intent=new Intent();
        intent.putExtra("name","     超越梦想");
        intent.setAction("com.qf.game");
        sendBroadcast(intent);
    }


    public void sendOrdBroadcast(View view){
        Intent intent=new Intent("com.qf.order");
        intent.putExtra("order","原始数据");
        sendOrderedBroadcast(intent,null);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(screenOnOffReceiver);//注销广播接收器
        unregisterReceiver(connectiveReceiver);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
