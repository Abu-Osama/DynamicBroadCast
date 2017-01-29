package com.example.abuosama.dynamicbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public class MyReciver extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {

            Toast.makeText(context, "DYNAMIC Power Unplug", Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link intent filter with above broad cast recver
        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction(Intent.ACTION_POWER_DISCONNECTED);
        MyReciver m=new MyReciver();
        registerReceiver(m,intentFilter);

    }
}
