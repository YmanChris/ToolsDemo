package com.example.yman.toolslibrary.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Yman on 2017/12/18.
 * E-Mail : yin_xiangyang@outlook.com
 * WeChat : y22620
 */

public class SharedPrefrenceUtils {

    public static final String sharedPrefrenceName = "SharedPrefrenceUtils";

    public void add(Context context, String key, String value){
        SharedPreferences sharedPreferences = context.getSharedPreferences(sharedPrefrenceName,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public String get(Context context, String key){
        SharedPreferences sharedPreferences = context.getSharedPreferences(sharedPrefrenceName, Context.MODE_PRIVATE);
        return sharedPreferences.getString(key, null);
    }

    public void update(Context context, String key, String value){
        SharedPreferences sharedPreferences = context.getSharedPreferences(sharedPrefrenceName,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }



}
