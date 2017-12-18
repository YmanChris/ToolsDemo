package com.example.yman.toolslibrary.Utils;

import android.util.Log;

/**
 * Created by Yman on 2017/12/16.
 * E-Mail : yin_xiangyang@outlook.com
 * WeChat : y22620
 */

public class LogUtils {
    public static boolean debugger = true;

    public static void setDebugger(boolean debugger) {
        LogUtils.debugger = debugger;
    }

    public static void e(String tag, String msg){
        if(debugger) {
            Log.e(tag, msg);
        } else{
            return;
        }
    }

    public static void i(String tag, String msg){
        if(debugger) {
            Log.i(tag, msg);
        } else{
            return;
        }
    }

    public static void d(String tag, String msg){
        if(debugger) {
            Log.d(tag, msg);
        } else{
            return;
        }
    }

    public static void w(String tag, String msg){
        if(debugger) {
            Log.w(tag, msg);
        } else{
            return;
        }
    }
}
