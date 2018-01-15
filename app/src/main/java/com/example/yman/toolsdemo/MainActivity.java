package com.example.yman.toolsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yman.toolslibrary.Utils.LogUtils;
import com.example.yman.toolslibrary.Utils.ToastUtils;

import java.util.logging.Logger;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.show_toast)
    TextView showToast;

    @OnClick(R.id.show_toast) void submit(){
        /*ToastUtils toastUtils = new ToastUtils(this);
        toastUtils.setText("this is ToastUtil");
        toastUtils.setGravity(Gravity.CENTER, 0, 0);
        toastUtils.show(1000);*/
        LogUtils.removeFilter("abc");
        LogUtils.i("ddd","aaa");
        LogUtils.i("dd","aaa");
        LogUtils.i("bdd","abc");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        LogUtils.setDebugger(true);
        LogUtils.filter("ddd").filter("abc");
    }
}
