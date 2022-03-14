package com.android.xd.immersivebar;

import android.app.Activity;
import android.os.Bundle;

import com.android.xd.immersivelib.ImmersionUtil;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImmersionUtil.setTranslucentStatusBar(this, R.color.colorAccent, true);
        ImmersionUtil.setTranslucentStatusBarForImage(this, true);
//        ImmersionUtil.setFullScreen(this);
//        ImmersionUtil.setStatusBarColor(this,R.color.colorPrimaryDark);
    }
}
