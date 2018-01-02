package com.example.yman.toolslibrary.Utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;


/**
 * Created by Yman on 2017/12/17.
 * E-Mail : yin_xiangyang@outlook.com
 * WeChat : y22620
 */

public class ToastUtils {
    private Context mContext = null;
    private Toast mToast = null;
    private Handler mHandler = null;
    private int duration = 0;
    private int currentDuration = 0;
    private final int DEFAULT = 10;

    private Runnable mToastThread = new Runnable() {
        @Override
        public void run() {
            mToast.show();
            mHandler.postDelayed(mToastThread, DEFAULT);
            if(duration != 0){
                if(currentDuration < duration){
                    currentDuration += DEFAULT;
                } else{
                    cancel();
                }
            }
        }
    };

    public ToastUtils(Context mContext) {
        this.mContext = mContext;
        duration = DEFAULT;
        mHandler = new Handler(Looper.getMainLooper());
        mToast = Toast.makeText(mContext, "", Toast.LENGTH_SHORT);
    }

    public void setText(String text){
        mToast.setText(text);
    }

    public void show(int duration){
        this.duration = duration;
        mHandler.post(mToastThread);
    }

    public void setGravity(int gravity, int xOffset, int yOffset){
        mToast.setGravity(gravity, xOffset, yOffset);
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public void setView(View view){
        mToast.setView(view);
    }

    public void cancel(){
        mHandler.removeCallbacks(mToastThread);
        mToast.cancel();;
        currentDuration = DEFAULT;
    }

}
