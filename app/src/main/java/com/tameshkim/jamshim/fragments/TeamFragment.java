package com.tameshkim.jamshim.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.tameshkim.jamshim.FeedItems.TeamFeedItem;
import com.tameshkim.jamshim.FeedListAdapters.TeamAdapter;
import com.tameshkim.jamshim.R;

import java.util.ArrayList;
import java.util.List;


public class TeamFragment extends Fragment {

    private List<TeamFeedItem> feedList = new ArrayList<>();
    private TeamAdapter mAdapter;

    private RecyclerView recyclerView;

    public TeamFragment() {
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
        final View rootView = inflater.inflate(R.layout.fragment_team, container, false);
        recyclerView=(RecyclerView)rootView.findViewById(R.id.recycler_view);
        mAdapter = new TeamAdapter(this.getActivity(),feedList);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(rootView.getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        feedList.add(new TeamFeedItem("1","استقلال - پرسپولیس"));
        feedList.add(new TeamFeedItem("2","ذوب آهن - سپاهان"));
        feedList.add(new TeamFeedItem("3","تراکتور سازی - سیاه جامگان"));
        feedList.add(new TeamFeedItem("4","مس کرمان- استقلال خوزستان"));
        feedList.add(new TeamFeedItem("5","تربیت یزد - صنعت نفت"));
        feedList.add(new TeamFeedItem("6","بورنموث - برایتون"));
        feedList.add(new TeamFeedItem("7","لیورپول - برنلی"));
        feedList.add(new TeamFeedItem("8","هانوفر - هامبورگ"));
        feedList.add(new TeamFeedItem("9","رءال سوسیاد - رءال مادرید"));
        feedList.add(new TeamFeedItem("10","خیرونیا - سویا"));
        mAdapter.notifyDataSetChanged();



        Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner);
        String[] arrayStrings=new String[]{"فوتبال"};
        ArrayAdapter adapter=new ArrayAdapter<>(this.getContext(),R.layout.spiner_item,arrayStrings);
        spinner.setAdapter(adapter);
        Spinner spinner2 = (Spinner) rootView.findViewById(R.id.spinner2);
        String[] arrayStrings2=new String[]{"جام خلیج فارسی","لیگ برتر انگلیس","لالیگا اسپانیا","بندسلیگاآلمان"};
        ArrayAdapter<String> adapter2=new ArrayAdapter<>(this.getContext(),R.layout.spiner_item,arrayStrings2);
        spinner2.setAdapter(adapter2);
        return rootView;
    }


}
