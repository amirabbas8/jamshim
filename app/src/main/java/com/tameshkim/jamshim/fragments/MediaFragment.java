package com.tameshkim.jamshim.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tameshkim.jamshim.FeedItems.MediaFeedItem;
import com.tameshkim.jamshim.FeedListAdapters.MediaAdapter;
import com.tameshkim.jamshim.R;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by amirh on 15/09/17.
 */

public class MediaFragment extends Fragment {

    private List<MediaFeedItem> feedList = new ArrayList<>();
    private MediaAdapter mAdapter;

    private RecyclerView recyclerView;

    @Override
    public void onPause() {
        super.onPause();
        mAdapter.setVideoPause();
        Log.d(TAG , "on pauseeeeeeee :: " );
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
        final View rootView = inflater.inflate(R.layout.fragment_media, container, false);
        recyclerView=(RecyclerView)rootView.findViewById(R.id.recycler_view_media);
        mAdapter = new MediaAdapter(this.getActivity(),feedList);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(rootView.getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        if(feedList.size()==0){
            feedList.add(new MediaFeedItem("پرسپولیس  -  الاهلی" , " صحنه ویژه" , R.drawable.stadium_4,
                    "کافه بالسا" , " ویژه" , R.drawable.coffeeshop_3,
                    "حاشیه " , "ویژه" , R.drawable.coffeeshop_4));
            mAdapter.notifyDataSetChanged();
        }


        return rootView;
    }
}
