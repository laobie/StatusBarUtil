package com.jaeger.statusbardemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends BaseActivity {
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private CheckBox chbTranslucent;
    private Button btnColorStatus;
    private Button btnImageStatus;
    private ViewGroup contentLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        contentLayout = (ViewGroup) findViewById(R.id.main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        chbTranslucent = (CheckBox) findViewById(R.id.chb_translucent);
        btnColorStatus = (Button) findViewById(R.id.btn_color_status);
        btnImageStatus = (Button) findViewById(R.id.btn_image_status);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        btnColorStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ColorStatusBarActivity.class);
                startActivity(intent);
            }
        });

        btnImageStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageStatusBarActivity.class);
                startActivity(intent);
            }
        });

        chbTranslucent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chbTranslucent.isChecked()) {
                    contentLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_run));
                    StatusBarUtils.setTranslucentForDrawerLayout(MainActivity.this, drawerLayout);
                    toolbar.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                } else {
                    contentLayout.setBackgroundDrawable(null);
                    toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    StatusBarUtils.setColorForDrawerLayout(MainActivity.this, drawerLayout, getResources().getColor(R
                            .color.colorPrimary));
                }
            }
        });

    }

    @Override
    protected void setStatusBar() {
        StatusBarUtils.setColorForDrawerLayout(this, (DrawerLayout) findViewById(R.id.drawer_layout), getResources()
                .getColor(R.color.colorPrimary));
    }

}
