package com.jaeger.statusbarutil;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jaeger.library.StatusBarUtil;
import com.jaeger.statusbardemo.R;

/**
 * Created by walter on 2019/11/7.
 * Email: fengxiao1493@qq.com
 * GitHub: https://github.com/walterFeng
 */
public class LightModeActivity extends BaseActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_mode);
        mToolbar = findViewById(R.id.toolbar);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        setSupportActionBar(mToolbar);
        mToolbar.setTitleTextColor(Color.BLACK);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerView.Adapter() {
            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
                TextView item = new TextView(LightModeActivity.this);
                item.setTextSize(28f);
                item.setPadding(50, 0, 0, 0);
                ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 300);
                item.setLayoutParams(params);
                return new ViewHolder(item);
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
                ((ViewHolder) viewHolder).onBind(i);
            }

            @Override
            public int getItemCount() {
                return 30;
            }
        });
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {

            int scrolledY = 0;
            int offsetY = 500;

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                scrolledY += dy;
                float alpha = scrolledY * 1f / offsetY;
                if (alpha > 1f) {
                    alpha = 1f;
                } else if (alpha < 0f) {
                    alpha = 0f;
                }
                int finalAlpha = (int) (alpha * 255);
                StatusBarUtil.setColorWithAlpha(LightModeActivity.this, Color.WHITE, finalAlpha);
                mToolbar.setBackgroundColor(StatusBarUtil.calculateColorLightMode(Color.WHITE, finalAlpha));
            }
        });
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        ViewHolder(View itemView) {
            super(itemView);
            this.textView = (TextView) itemView;
        }

        void onBind(int position) {
            textView.setText("item" + position);
            textView.setGravity(Gravity.CENTER_VERTICAL);
        }
    }

    @Override
    protected void setStatusBar() {
        StatusBarUtil.setStatusColorForImageView(this, Color.WHITE, 0, findViewById(R.id.toolbar));
    }
}
