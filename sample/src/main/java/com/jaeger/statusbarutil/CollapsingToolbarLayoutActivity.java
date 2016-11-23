package com.jaeger.statusbarutil;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import com.jaeger.library.StatusBarUtil;
import com.jaeger.statusbardemo.R;

/**
 * Created by Jaeger on 2016/11/8.
 *
 * Email: chjie.jaeger@gmail.com
 * GitHub: https://github.com/laobie
 */

public class CollapsingToolbarLayoutActivity extends BaseActivity {

    private CollapsingToolbarLayout mCollapsingToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar_layout);
        mCollapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);

        StatusBarUtil.setCollapsingToolbarLayout(this, mCollapsingToolbar, getResources().getColor(R.color.colorAccent));
    }

    @Override
    protected void setStatusBar() {

    }
}
