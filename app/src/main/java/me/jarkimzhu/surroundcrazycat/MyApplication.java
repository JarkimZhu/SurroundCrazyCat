package me.jarkimzhu.surroundcrazycat;

import android.app.Application;

import cn.winapk.sdk.WinApk;

/**
 * Created on 2019/12/16.
 *
 * @author JarkimZhu
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        WinApk.Options options = new WinApk.Options("p-test");
        options.getSplashOptions().setSplashDrawableId(R.drawable.login);
        WinApk.INSTANCE.init(this, options, null);
    }
}
