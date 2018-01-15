package com.example.yman.toolslibrary.Utils;

import android.util.Log;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yman on 2017/12/16.
 * E-Mail : yin_xiangyang@outlook.com
 * WeChat : y22620
 */

public class LogUtils {

    private static LogUtils sLogUtils;

    private static boolean debugger = true;

    private static List<String> filterList = new LinkedList<>();

    public static void setDebugger(boolean debugger) {
        LogUtils.debugger = debugger;
    }

    public static LogUtils filter(String str){
        if(null == sLogUtils) {
            sLogUtils = new LogUtils();
        }
        sLogUtils.filterList.add(str);
        return sLogUtils;
    }

    public static LogUtils removeFilter(String str){
        if(null == sLogUtils) {
            sLogUtils = new LogUtils();
        }
        for(int i = 0 ; i < sLogUtils.filterList.size() ; i ++){
            if(StringUtils.isEqual(sLogUtils.filterList.get(i), str)){
                sLogUtils.filterList.remove(i);
                i--;
            }
        }
        return sLogUtils;
    }

    public static void e(String tag, String msg){
        if(null == sLogUtils) {
            sLogUtils = new LogUtils();
        }
        if(sLogUtils.debugger) {
            if(sLogUtils.filterList.size() != 0) {
                for(int i = 0 ; i < sLogUtils.filterList.size() ; i ++) {
                    if((tag + msg).contains(sLogUtils.filterList.get(i))) {
                        Log.e(tag, msg);
                    }
                }
            } else {
                Log.e(tag, msg);
            }
        } else{
            return;
        }
    }

    public static void i(String tag, String msg){
        if(null == sLogUtils) {
            sLogUtils = new LogUtils();
        }
        if(sLogUtils.debugger) {
            if(sLogUtils.filterList.size() != 0) {
                for(int i = 0 ; i < sLogUtils.filterList.size() ; i ++) {
                    if((tag + msg).contains(sLogUtils.filterList.get(i))) {
                        Log.i(tag, msg);
                    }
                }
            } else {
                Log.i(tag, msg);
            }
        } else{
            return;
        }
    }

    public static void d(String tag, String msg){
        if(null == sLogUtils) {
            sLogUtils = new LogUtils();
        }
        if(sLogUtils.debugger) {
            if(sLogUtils.filterList.size() != 0) {
                for(int i = 0 ; i < sLogUtils.filterList.size() ; i ++) {
                    if((tag + msg).contains(sLogUtils.filterList.get(i))) {
                        Log.d(tag, msg);
                    }
                }
            } else {
                Log.d(tag, msg);
            }
        } else{
            return;
        }
    }

    public static void w(String tag, String msg){
        if(null == sLogUtils) {
            sLogUtils = new LogUtils();
        }
        if(sLogUtils.debugger) {
            if(sLogUtils.filterList.size() != 0) {
                for(int i = 0 ; i < sLogUtils.filterList.size() ; i ++) {
                    if((tag + msg).contains(sLogUtils.filterList.get(i))) {
                        Log.w(tag, msg);
                    }
                }
            } else {
                Log.w(tag, msg);
            }
        } else{
            return;
        }
    }
}
