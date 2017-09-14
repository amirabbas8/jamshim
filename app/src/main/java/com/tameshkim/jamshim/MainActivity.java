package com.tameshkim.jamshim;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.tameshkim.jamshim.fragments.HomeFragment;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        viewPager.setCurrentItem(1);
        viewPager.setOffscreenPageLimit(2);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }


    private void setupTabIcons() {

        TextView tabPeople = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabPeople.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_home, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabPeople);
        TextView tabMyLife = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabMyLife.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_home, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabMyLife);
        TextView tabSearch = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabSearch.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_home, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabSearch);
//        TextView tabAthena = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
//        tabAthena.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_mic_none_white, 0, 0);
//        tabLayout.getTabAt(3).setCustomView(tabAthena);

    }


    private void setupViewPager(final ViewPager viewPager) {
        ViewPagerAdapter adapter;
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new HomeFragment(), "");
        adapter.addFrag(new HomeFragment(), "");
        adapter.addFrag(new HomeFragment(), "");
        viewPager.setAdapter(adapter);

    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }





}
