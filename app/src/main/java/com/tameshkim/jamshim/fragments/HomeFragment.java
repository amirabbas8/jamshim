package com.tameshkim.jamshim.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tameshkim.jamshim.FeedItems.HomeFeedItem;
import com.tameshkim.jamshim.FeedListAdapters.HomeAdapter;
import com.tameshkim.jamshim.R;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private List<HomeFeedItem> homeList = new ArrayList<>();
    private HomeAdapter mAdapter;

    private RecyclerView recyclerView;

    public HomeFragment() {
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
        final View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=(RecyclerView)rootView.findViewById(R.id.recycler_view);
        mAdapter = new HomeAdapter(this.getActivity(),homeList);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(rootView.getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        return rootView;
    }


}
