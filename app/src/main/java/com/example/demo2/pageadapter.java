package com.example.demo2;

import androidx.fragment.app.FragmentPagerAdapter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class pageadapter extends FragmentPagerAdapter {

    int tabcount;

    public pageadapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new Popular();

            case 1:
                return new Discount();

            case 2:
                return new Exclusive();

            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
