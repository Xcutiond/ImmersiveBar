package com.example.immersivelib_ktx

import android.R
import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.app.Activity
import android.graphics.Color
import android.os.Build
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.annotation.IntDef
import com.example.immersivelib_ktx.ImmersionOsUtils.isFlyme
import com.example.immersivelib_ktx.ImmersionOsUtils.isMiui
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * 沉浸式相关工具类
 * ImmersionBar.with(this)
 * .transparentStatusBar()  //透明状态栏，不写默认透明色
 * .transparentNavigationBar()  //透明导航栏，不写默认黑色(设置此方法，fullScreen()方法自动为true)
 * .transparentBar()             //透明状态栏和导航栏，不写默认状态栏为透明色，导航栏为黑色（设置此方法，fullScreen()方法自动为true）
 * .statusBarColor(R.color.colorPrimary)     //状态栏颜色，不写默认透明色
 * .navigationBarColor(R.color.colorPrimary) //导航栏颜色，不写默认黑色
 * .barColor(R.color.colorPrimary)  //同时自定义状态栏和导航栏颜色，不写默认状态栏为透明色，导航栏为黑色
 * .statusBarAlpha(0.3f)  //状态栏透明度，不写默认0.0f
 * .navigationBarAlpha(0.4f)  //导航栏透明度，不写默认0.0F
 * .barAlpha(0.3f)  //状态栏和导航栏透明度，不写默认0.0f
 * .statusBarDarkFont(true)   //状态栏字体是深色，不写默认为亮色
 * .navigationBarDarkIcon(true) //导航栏图标是深色，不写默认为亮色
 * .autoDarkModeEnable(true) //自动状态栏字体和导航栏图标变色，必须指定状态栏颜色和导航栏颜色才可以自动变色哦
 * .autoStatusBarDarkModeEnable(true,0.2f) //自动状态栏字体变色，必须指定状态栏颜色才可以自动变色哦
 * .autoNavigationBarDarkModeEnable(true,0.2f) //自动导航栏图标变色，必须指定导航栏颜色才可以自动变色哦
 * .flymeOSStatusBarFontColor(R.color.btn3)  //修改flyme OS状态栏字体颜色
 * .fullScreen(true)      //有导航栏的情况下，activity全屏显示，也就是activity最下面被导航栏覆盖，不写默认非全屏
 * .hideBar(BarHide.FLAG_HIDE_BAR)  //隐藏状态栏或导航栏或两者，不写默认不隐藏
 * .addViewSupportTransformColor(toolbar)  //设置支持view变色，可以添加多个view，不指定颜色，默认和状态栏同色，还有两个重载方法
 * .titleBar(view)    //解决状态栏和布局重叠问题，任选其一
 * .titleBarMarginTop(view)     //解决状态栏和布局重叠问题，任选其一
 * .statusBarView(view)  //解决状态栏和布局重叠问题，任选其一
 * .fitsSystemWindows(true)    //解决状态栏和布局重叠问题，任选其一，默认为false，当为true时一定要指定statusBarColor()，不然状态栏为透明色，还有一些重载方法
 * .supportActionBar(true) //支持ActionBar使用
 * .statusBarColorTransform(R.color.orange)  //状态栏变色后的颜色
 * .navigationBarColorTransform(R.color.orange) //导航栏变色后的颜色
 * .barColorTransform(R.color.orange)  //状态栏和导航栏变色后的颜色
 * .removeSupportView(toolbar)  //移除指定view支持
 * .removeSupportAllView() //移除全部view支持
 * .navigationBarEnable(true)   //是否可以修改导航栏颜色，默认为true
 * .navigationBarWithKitkatEnable(true)  //是否可以修改安卓4.4和emui3.1手机导航栏颜色，默认为true
 * .fixMarginAtBottom(true)   //已过时，当xml里使用android:fitsSystemWindows="true"属性时,解决4.4和emui3.1手机底部有时会出现多余空白的问题，默认为false，非必须
 * .addTag("tag")  //给以上设置的参数打标记
 * .getTag("tag")  //根据tag获得沉浸式参数
 * .reset()  //重置所以沉浸式参数
 * .keyboardEnable(true)  //解决软键盘与底部输入框冲突问题，默认为false，还有一个重载方法，可以指定软键盘mode
 * .keyboardMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)  //单独指定软键盘模式
 * .setOnKeyboardListener(new OnKeyboardListener() {    //软键盘监听回调
 *
 * @Override public void onKeyboardChange(boolean isPopup, int keyboardHeight) {
 * LogUtils.e(isPopup);  //isPopup为true，软键盘弹出，为false，软键盘关闭
 * }
 * })
 * .init();  //必须调用方可沉浸式
 */
object ImmersionUtil {
    fun setTranslucentStatusBar(
        activity: Activity?,
        statusBarColorResId: Int,
        isStatusBarDarkMode: Boolean
    ) {
//        ImmersionBar.with(activity)
//                .transparentStatusBar()
//                .statusBarDarkFont(isStatusBarDarkMode)
//                .statusBarColor(statusBarColorResId)
////                .navigationBarColor(R.color.color_half_transparent)
//                .fitsSystemWindows(true)//防止状态栏和头部界面重叠
////                .fullScreen(false)//防止底部界面被导航栏遮挡
//                .init();
    }

    fun setFullScreen(activity: Activity?) {
//        ImmersionBar.with(activity)
//                .hideBar(BarHide.FLAG_HIDE_BAR)
//                .init();
    }

    /**
     * 有图片的沉浸式沉浸式状态栏
     * 需要在布局中加入StatusBarHeightView
     */
    fun setTranslucentStatusBarForImage(activity: Activity, isDark: Boolean) {
        //当FitsSystemWindows设置 true 时，会在屏幕最上方预留出状态栏高度的 padding，
        setRootViewFitsSystemWindows(activity, false)
        //设置状态栏透明
        setTranslucentStatus(activity)
        //一般的手机的状态栏文字和图标都是白色的, 可如果你的应用也是纯白色的, 或导致状态栏文字看不清
        //所以如果你是这种情况,请使用以下代码, 设置状态使用深色文字图标风格, 否则你可以选择性注释掉这个if内容
        if (!setStatusBarDarkTheme(activity, isDark)) {
            //如果不支持设置深色风格 为了兼容总不能让状态栏白白的看不清, 于是设置一个状态栏颜色为半透明,
            //这样半透明+白=灰, 状态栏的文字能看得清
            setStatusBarColor(activity, 0x55000000)
        }
    }

    const val TYPE_MIUI = 0
    const val TYPE_FLYME = 1
    const val TYPE_M = 3 //6.0

    /**
     * 修改状态栏颜色，支持4.4以上版本
     *
     * @param color 颜色
     */
    fun setStatusBarColor(activity: Activity, color: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = activity.window
            val decorView = window.decorView
            //两个 flag 要结合使用，表示让应用的主体内容占用系统状态栏的空间
            val option = (View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    or View.SYSTEM_UI_FLAG_LAYOUT_STABLE)
            decorView.systemUiVisibility = option
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = color
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //使用SystemBarTintManager,需要先将状态栏设置为透明
            setTranslucentStatus(activity)
            val systemBarTintManager = SystemBarTintManager(activity)
            systemBarTintManager.isStatusBarTintEnabled = true //显示状态栏
            systemBarTintManager.setStatusBarTintColor(color) //设置状态栏颜色
        }
    }

    /**
     * 设置状态栏透明
     */
    @TargetApi(19)
    private fun setTranslucentStatus(activity: Activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            //5.x开始需要把颜色设置透明，否则导航栏会呈现系统默认的浅灰色
            val window = activity.window
            val decorView = window.decorView
            //两个 flag 要结合使用，表示让应用的主体内容占用系统状态栏的空间
            val option = (View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    or View.SYSTEM_UI_FLAG_LAYOUT_STABLE)
            decorView.systemUiVisibility = option
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.TRANSPARENT
            //导航栏颜色也可以正常设置
            //window.setNavigationBarColor(Color.TRANSPARENT);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val window = activity.window
            val attributes = window.attributes
            val flagTranslucentStatus = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
            attributes.flags = attributes.flags or flagTranslucentStatus
            //int flagTranslucentNavigation = WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION;
            //attributes.flags |= flagTranslucentNavigation;
            window.attributes = attributes
        }
    }

    /**
     * 代码实现android:fitsSystemWindows
     *
     * @param activity
     */
    private fun setRootViewFitsSystemWindows(activity: Activity, fitSystemWindows: Boolean) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val winContent = activity.findViewById<View>(R.id.content) as ViewGroup
            Log.d("dadada", "setRootViewFitsSystemWindows winContent:" + winContent.childCount)
            if (winContent.childCount > 0) {
                val rootView = winContent.getChildAt(0) as ViewGroup
                Log.d("dadada", "setRootViewFitsSystemWindows rootView:$rootView")
                if (rootView != null) {
                    rootView.fitsSystemWindows = fitSystemWindows
                }
            }
        }
    }

    /**
     * 设置状态栏深色浅色切换
     */
    private fun setStatusBarDarkTheme(activity: Activity, dark: Boolean): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                setStatusBarFontIconDark(activity, TYPE_M, dark)
            } else if (isMiui) {
                setStatusBarFontIconDark(activity, TYPE_MIUI, dark)
            } else if (isFlyme) {
                setStatusBarFontIconDark(activity, TYPE_FLYME, dark)
            } else { //其他情况
                return false
            }
            return true
        }
        return false
    }

    /**
     * 设置 状态栏深色浅色切换
     */
    private fun setStatusBarFontIconDark(
        activity: Activity,
        @ViewType type: Int,
        dark: Boolean
    ): Boolean {
        return when (type) {
            TYPE_MIUI -> setMiuiUI(
                activity,
                dark
            )
            TYPE_FLYME -> setFlymeUI(
                activity,
                dark
            )
            TYPE_M -> setCommonUI(
                activity,
                dark
            )
            else -> setCommonUI(activity, dark)
        }
    }

    //设置6.0 状态栏深色浅色切换
    private fun setCommonUI(activity: Activity, dark: Boolean): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val decorView = activity.window.decorView
            if (decorView != null) {
                var vis = decorView.systemUiVisibility
                vis = if (dark) {
                    vis or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
                } else {
                    vis and View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR.inv()
                }
                if (decorView.systemUiVisibility != vis) {
                    decorView.systemUiVisibility = vis
                }
                return true
            }
        }
        return false
    }

    //设置Flyme 状态栏深色浅色切换
    private fun setFlymeUI(activity: Activity, dark: Boolean): Boolean {
        return try {
            val window = activity.window
            val lp = window.attributes
            val darkFlag =
                WindowManager.LayoutParams::class.java.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON")
            val meizuFlags = WindowManager.LayoutParams::class.java.getDeclaredField("meizuFlags")
            darkFlag.isAccessible = true
            meizuFlags.isAccessible = true
            val bit = darkFlag.getInt(null)
            var value = meizuFlags.getInt(lp)
            value = if (dark) {
                value or bit
            } else {
                value and bit.inv()
            }
            meizuFlags.setInt(lp, value)
            window.attributes = lp
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    //设置MIUI 状态栏深色浅色切换
    private fun setMiuiUI(activity: Activity, dark: Boolean): Boolean {
        return try {
            val window = activity.window
            val clazz: Class<*> = activity.window.javaClass
            @SuppressLint("PrivateApi") val layoutParams =
                Class.forName("android.view.MiuiWindowManager\$LayoutParams")
            val field = layoutParams.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE")
            val darkModeFlag = field.getInt(layoutParams)
            val extraFlagField = clazz.getDeclaredMethod(
                "setExtraFlags",
                Int::class.javaPrimitiveType,
                Int::class.javaPrimitiveType
            )
            extraFlagField.isAccessible = true
            if (dark) {    //状态栏亮色且黑色字体
                extraFlagField.invoke(window, darkModeFlag, darkModeFlag)
            } else {
                extraFlagField.invoke(window, 0, darkModeFlag)
            }
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    @IntDef(TYPE_MIUI, TYPE_FLYME, TYPE_M)
    @Retention(RetentionPolicy.SOURCE)
    internal annotation class ViewType
}