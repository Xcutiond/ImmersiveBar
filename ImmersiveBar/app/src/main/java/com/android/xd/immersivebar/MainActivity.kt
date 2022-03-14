package com.android.xd.immersivebar

import com.example.immersivelib_ktx.ImmersionUtil.setTranslucentStatusBarForImage
import android.app.Activity
import android.os.Bundle
import com.android.xd.immersivebar.R

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //        ImmersionUtil.setTranslucentStatusBar(this, R.color.colorAccent, true);
        setTranslucentStatusBarForImage(this, true)
        //        ImmersionUtil.setFullScreen(this);
//        ImmersionUtil.setStatusBarColor(this,R.color.colorPrimaryDark);
    }
}