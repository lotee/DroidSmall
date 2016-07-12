package com.sunfusheng.small.lib.framework;

import android.content.Context;

/**
 * Created by sunfusheng on 16/4/13.
 */
public class DroidFramework {

    private static Context mContext;
    public static final String LOG_URL = "log-url";
    public static final String LOG_CONTENT = "log-content";

    public static boolean LOG = true;

    // 使用该框架必须先初始化
    public static void init(Context context, boolean isLog) {
        mContext = context;
        LOG = isLog;
    }

    public static Context getContext() {
        if (mContext == null) {
            throw new RuntimeException("使用该框架必须先初始化");
        }
        return mContext;
    }

}
