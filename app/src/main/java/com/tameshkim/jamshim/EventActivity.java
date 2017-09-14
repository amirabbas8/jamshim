package com.tameshkim.jamshim;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tameshkim.jamshim.FeedItems.EventFeedItem;
import com.tameshkim.jamshim.FeedListAdapters.EventAdapter;

import java.util.ArrayList;
import java.util.List;

public class EventActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private EventAdapter mAdapter;
    private List<EventFeedItem> eventList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new EventAdapter(this, eventList);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        EventFeedItem eventFeedItem = new EventFeedItem();
        eventFeedItem.setId("1");
        eventFeedItem.setName("salam");
        eventFeedItem.setTeams("team1:team2");
        eventFeedItem.setDate("1325");
        eventList.add(eventFeedItem);
        mAdapter.notifyDataSetChanged();
    }
}
