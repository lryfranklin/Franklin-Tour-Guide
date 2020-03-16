package com.example.newstoday;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class StateFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] stateNames;

    public StateFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        stateNames = new String[] {context.getResources().getString(R.string.arizona),
                context.getResources().getString(R.string.california), context.getResources().getString(R.string.washington),
                context.getResources().getString(R.string.texas), context.getResources().getString(R.string.nevada)};
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ArizonaFragment();
            case 1:
                return new CaliforniaFragment();
            case 2:
                return new WashingtonFragment();
            case 3:
                return new TexasFragment();
            case 4:
                return new NevadaFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return stateNames.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return stateNames[position];
    }
}
