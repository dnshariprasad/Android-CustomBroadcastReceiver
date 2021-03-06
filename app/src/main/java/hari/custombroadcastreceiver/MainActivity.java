package hari.custombroadcastreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private IntentFilter filter;
    private MyReceiver myReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void broadCastPlease(View view) {
        Intent intent = new Intent();
        intent.setAction("hari.custombroadcastreceiver.CLICK_BR");
        intent.putExtra("Foo", "Bar");
        sendBroadcast(intent);
    }
}
