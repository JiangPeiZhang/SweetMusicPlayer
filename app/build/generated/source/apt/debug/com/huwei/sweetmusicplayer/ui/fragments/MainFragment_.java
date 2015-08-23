//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.huwei.sweetmusicplayer.ui.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huwei.sweetmusicplayer.R.array;
import com.huwei.sweetmusicplayer.R.layout;
import com.huwei.sweetmusicplayer.ui.widgets.ScrollableTabView;
import org.androidannotations.api.builder.FragmentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class MainFragment_
    extends com.huwei.sweetmusicplayer.ui.fragments.MainFragment
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private View contentView_;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    @Override
    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(layout.fragment_main, container, false);
        }
        return contentView_;
    }

    @Override
    public void onDestroyView() {
        contentView_ = null;
        super.onDestroyView();
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        Resources resources_ = getActivity().getResources();
        sleep_times = resources_.getIntArray(array.sleep_times);
        inflater = ((LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE));
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static MainFragment_.FragmentBuilder_ builder() {
        return new MainFragment_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        toolbar = ((Toolbar) hasViews.findViewById(com.huwei.sweetmusicplayer.R.id.toolbar));
        tv_sleepinfo = ((TextView) hasViews.findViewById(com.huwei.sweetmusicplayer.R.id.tv_sleepinfo));
        viewPager = ((ViewPager) hasViews.findViewById(com.huwei.sweetmusicplayer.R.id.viewPager));
        tv_sleep_cancel = ((TextView) hasViews.findViewById(com.huwei.sweetmusicplayer.R.id.tv_sleep_cancel));
        ll_sleepbar = ((LinearLayout) hasViews.findViewById(com.huwei.sweetmusicplayer.R.id.ll_sleepbar));
        scrollingTabs = ((ScrollableTabView) hasViews.findViewById(com.huwei.sweetmusicplayer.R.id.scrollingTabs));
        if (tv_sleep_cancel!= null) {
            tv_sleep_cancel.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    MainFragment_.this.tv_sleep_cancelWasClicked();
                }

            }
            );
        }
        init();
    }

    public static class FragmentBuilder_
        extends FragmentBuilder<MainFragment_.FragmentBuilder_, com.huwei.sweetmusicplayer.ui.fragments.MainFragment>
    {


        @Override
        public com.huwei.sweetmusicplayer.ui.fragments.MainFragment build() {
            MainFragment_ fragment_ = new MainFragment_();
            fragment_.setArguments(args);
            return fragment_;
        }

    }

}
