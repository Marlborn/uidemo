package dev.majes.app.ui.fragment;

import android.os.Bundle;
import android.view.View;
import dev.majes.app.R;
import dev.majes.base.log.Log;
import dev.majes.base.mvp.BaseFragment;

/**
 * Author：Marlborn
 * Email：marlborn@foxmail.com
 */
public class SecondPageFragment extends BaseFragment {


    @Override
    public void bindUI(View rootView) {

    }

    @Override
    public void initData(Bundle savedInstanceState) {
        Log.e("-----------------");
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment;
    }

}
