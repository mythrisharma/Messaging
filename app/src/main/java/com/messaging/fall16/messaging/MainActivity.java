package com.messaging.fall16.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsMessage;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent sms_intent=getIntent();
        Bundle b=sms_intent.getExtras();
        TextView tv=(TextView)findViewById(R.id.txtview);
        if(b!=null){
            // Display SMS in the TextView
            tv.setText(b.getString("sms_str"));
        }
    }
}
