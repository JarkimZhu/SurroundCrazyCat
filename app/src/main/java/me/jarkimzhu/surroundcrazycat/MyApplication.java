package me.jarkimzhu.surroundcrazycat;

import android.app.Application;

import cn.winapk.sdk.WinApk;
import me.jarkimzhu.surroundcrazycat.activities.MainActivity;

/**
 * Created on 2019/12/16.
 *
 * @author JarkimZhu
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        WinApk.Options options = new WinApk.Options("p-demo");
        options.getSplashOptions().setSplashDrawableId(R.drawable.login);
        options.getSplashOptions().setSplashSlotId("demo-splash");
        options.getSplashOptions().setAfterSplashActivity(MainActivity.class);
        WinApk.INSTANCE.init(this, options, null);
    }
}
