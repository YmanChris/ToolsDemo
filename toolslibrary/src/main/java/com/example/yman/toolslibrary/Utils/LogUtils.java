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
    public static boolean debugger = true;

    public static List<String> filterList = new LinkedList<>();

    public static void setDebugger(boolean debugger) {
        LogUtils.debugger = debugger;
    }

    public LogUtils filter(String str){
        filterList.add(str);
        return this;
    }

    public LogUtils removeFilter(String str){
        for(int i = 0 ; i < filterList.size() ; i ++){
            if(StringUtils.isEqual(filterList.get(i), str)){
                filterList.remove(i);
                i--;
            }
        }
        return this;
    }

    public static void e(String tag, String msg){
        if(debugger) {
            if(filterList.size() != 0) {
                for(int i = 0 ; i < filterList.size() ; i ++) {
                    if((tag + msg).contains(filterList.get(i))) {
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
        if(debugger) {
            if(filterList.size() != 0) {
                for(int i = 0 ; i < filterList.size() ; i ++) {
                    if((tag + msg).contains(filterList.get(i))) {
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
        if(debugger) {
            if(filterList.size() != 0) {
                for(int i = 0 ; i < filterList.size() ; i ++) {
                    if((tag + msg).contains(filterList.get(i))) {
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
        if(debugger) {
            Log.w(tag, msg);
        } else{
            return;
        }
    }
}
