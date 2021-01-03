package com.example.android.testing.unittesting.basicunitandroidtest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(final Context context, final Intent intent) {

        try {
            Toast t = Toast.makeText(context,"Broadcast："+intent.getStringExtra("info"), Toast.LENGTH_SHORT);

            if (intent.getAction().equals("android.intent.action.myreceiver")) {
                System.out.println("I am a BroadcastReceiver ");
            }
        } catch (Exception e) {
            System.out.println("I am a exception in MyReceiver ");
        }
    }
}
