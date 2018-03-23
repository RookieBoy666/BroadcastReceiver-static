package com.example.administrator.broadcastreceiverstatic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/3/22.
 */
public class BootCompleteReceiver extends BroadcastReceiver {
    private final String ACTION_BOOT = "android.intent.action.BOOT_COMPLETED";
    public  BootCompleteReceiver()
    {}
    @Override
    public void onReceive(Context context, Intent intent) {
        if (ACTION_BOOT.equals(intent.getAction()))
            Toast.makeText(context, "开机完毕~", Toast.LENGTH_LONG).show();
    }
}