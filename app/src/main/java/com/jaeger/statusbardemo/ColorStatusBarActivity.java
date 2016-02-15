package com.jaeger.statusbardemo;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.Random;

/**
 * Created by Jaeger on 16/2/14.
 * StatusBarDemo
 */
public class ColorStatusBarActivity extends BaseActivity {
    private Toolbar toolbar;
    private Button btnChangeColor;
    private CheckBox chbShowToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_status_bar);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        btnChangeColor = (Button) findViewById(R.id.btn_change_color);
        chbShowToolBar = (CheckBox) findViewById(R.id.chb_show_tool_bar);

        // 设置toolbar
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // 改变颜色
        btnChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int ranColor = 0xff000000 | random.nextInt(0x00ffffff);
                toolbar.setBackgroundColor(ranColor);
                StatusBarUtils.setColor(ColorStatusBarActivity.this, ranColor);
            }
        });

        // 切换toolbar显示
        chbShowToolBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chbShowToolBar.isChecked()) {
                    toolbar.setVisibility(View.VISIBLE);
                } else {
                    toolbar.setVisibility(View.GONE);
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
