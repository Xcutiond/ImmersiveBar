package com.android.xd.immersivebar;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.android.xd.immersivelib.ImmersionUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImmersionUtil.setTranslucentStatusBar(this, R.color.colorAccent, true);
//        ImmersionUtil.setTranslucentStatusBarForImage(this,false);
//        ImmersionUtil.setFullScreen(this);
//        ImmersionUtil.setStatusBarColor(this,R.color.colorPrimaryDark);
    }
}
