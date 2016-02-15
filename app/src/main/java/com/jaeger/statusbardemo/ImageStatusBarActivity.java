package com.jaeger.statusbardemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

/**
 * Created by Jaeger on 16/2/14.
 * StatusBarDemo
 */
public class ImageStatusBarActivity extends BaseActivity {
    private FrameLayout rootLayout;
    private Button btnChangeBackground;
    private boolean isBgChanged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_status_bar);

        rootLayout = (FrameLayout) findViewById(R.id.root_layout);
        btnChangeBackground = (Button) findViewById(R.id.btn_change_background);

        btnChangeBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isBgChanged = !isBgChanged;
                if (isBgChanged) {
                    rootLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_girl));
                } else {
                    rootLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_run));
                }
            }
        });

    }

    @Override
    protected void setStatusBarColor() {
        StatusBarUtils.setTranslucent(this);
    }
}
