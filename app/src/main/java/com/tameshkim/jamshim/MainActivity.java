package com.tameshkim.jamshim;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.tameshkim.jamshim.fragments.CafeFragment;
import com.tameshkim.jamshim.fragments.MediaFragment;
import com.tameshkim.jamshim.fragments.RecommendFragment;
import com.tameshkim.jamshim.fragments.TeamFragment;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        viewPager.setCurrentItem(1);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();

    }


    private void setupTabIcons() {

        TextView tabCoffee = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabCoffee.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_free_breakfast, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabCoffee);

        TextView tabMedia = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabMedia.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_home, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabMedia);

        TextView tabSport = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabSport.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_directions_bike, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabSport);

        TextView tabRecomm = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabRecomm.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_favorite, 0, 0);
        tabLayout.getTabAt(3).setCustomView(tabRecomm);

    }

    private void setupViewPager(final ViewPager viewPager) {
        final ViewPagerAdapter adapter;
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new CafeFragment(), "");
        adapter.addFrag(new MediaFragment(), "");
        adapter.addFrag(new TeamFragment(), "");
        adapter.addFrag(new RecommendFragment(), "");
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) { }
            @Override
            public void onPageSelected(int position) {    }
            @Override
            public void onPageScrollStateChanged(int state) {  adapter.getItem(1).onPause();  }
        });
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
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.action_logout) {
            PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).edit().putBoolean("isLogged", false  ).apply();
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        }
    return true;
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
