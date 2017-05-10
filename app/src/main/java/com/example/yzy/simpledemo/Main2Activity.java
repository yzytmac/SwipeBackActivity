package com.example.yzy.simpledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.swipback.swipbacklayout.SwipeBackActivity;
import com.example.swipback.swipbacklayout.SwipeBackLayout;

/**
 *
 *@author YangZhenYu
 *created at 17-5-10 下午4:04
 *功能：继承SwipeBackActivity并打开滑动退出，设置滑动方向即可实现滑动退出功能
 */
public class Main2Activity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //可以滑动退出
        setSwipeBackEnable(true);
        //设置为从左侧滑动退出
        getSwipeBackLayout().setEdgeTrackingEnabled(SwipeBackLayout.EDGE_LEFT);
    }
}
