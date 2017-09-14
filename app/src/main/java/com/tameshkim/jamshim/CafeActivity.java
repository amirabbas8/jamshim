package com.tameshkim.jamshim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tameshkim.jamshim.FeedItems.CafeFeedItem;
import com.tameshkim.jamshim.FeedListAdapters.CafeAdapter;

import java.util.ArrayList;
import java.util.List;

public class CafeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CafeAdapter mAdapter;
    private List<CafeFeedItem> homeList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new CafeAdapter(this, homeList);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        CafeFeedItem cafeFeedItem = new CafeFeedItem();
        cafeFeedItem.setId("1");
        cafeFeedItem.setName("salam");
        cafeFeedItem.setAddress("address");
        homeList.add(cafeFeedItem);
        mAdapter.notifyDataSetChanged();
    }
}
