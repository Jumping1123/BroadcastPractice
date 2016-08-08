package com.example.jumping.broadcastpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Jumping on 2016/8/8.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addactivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeactivity(this);
    }
}
