package com.jaeger.statusbarutil;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.jaeger.statusbardemo.R;

/**
 * Created by Jaeger on 16/8/11.
 *
 * Email: chjie.jaeger@gamil.com
 * GitHub: https://github.com/laobie
 */
public class SimpleFragment extends Fragment {
    private TextView mTvTitle;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragement_simple, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTvTitle = (TextView) view.findViewById(R.id.tv_title);
    }

    public void setTvTitleBackgroundColor(int color) {
        mTvTitle.setBackgroundColor(color);
    }
}
