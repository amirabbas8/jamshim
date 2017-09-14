package com.tameshkim.jamshim.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tameshkim.jamshim.FeedItems.CafeFeedItem;
import com.tameshkim.jamshim.FeedListAdapters.CafeAdapter;
import com.tameshkim.jamshim.R;

import java.util.ArrayList;
import java.util.List;


public class CafeFragment extends Fragment {

    private List<CafeFeedItem> homeList = new ArrayList<>();
    private CafeAdapter mAdapter;

    private RecyclerView recyclerView;

    public CafeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final View rootView = inflater.inflate(R.layout.fragment_cafe, container, false);
        recyclerView=(RecyclerView)rootView.findViewById(R.id.recycler_view);
        mAdapter = new CafeAdapter(this.getActivity(),homeList);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(rootView.getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        CafeFeedItem cafeFeedItem =new CafeFeedItem();
        cafeFeedItem.setId("1");
        cafeFeedItem.setName("salam");
        cafeFeedItem.setAddress("address");
        homeList.add(cafeFeedItem);
        mAdapter.notifyDataSetChanged();
        return rootView;
    }


}