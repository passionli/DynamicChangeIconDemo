package com.liguang.dynamicchangeicondemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @BindView(R.id.btn11)
    Button mBtn11;
    @BindView(R.id.btn12)
    Button mBtn12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        initData();
        initView();
    }

    private void initView() {

    }

    @OnClick(R.id.btn11)
    void switchTo11() {
        ChangeIconUtils.switchTo11(this);
    }

    @OnClick(R.id.btn12)
    void switchTo12() {
        ChangeIconUtils.switchTo12(this);
    }

    private void initData() {
        //mock data from server
        int displayIcon = 11;
        ChangeIconUtils.switchToIcon(this, displayIcon);
    }
}
