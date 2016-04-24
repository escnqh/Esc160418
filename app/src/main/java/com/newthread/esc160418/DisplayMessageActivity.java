package com.newthread.esc160418;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_message_activity);
        Intent intent=getIntent();
        String message=intent.getStringExtra("EXTRA_MESSAGE");
        TextView textView2=(TextView)findViewById(R.id.textView2);
        textView2.setText(message);

    }
}
