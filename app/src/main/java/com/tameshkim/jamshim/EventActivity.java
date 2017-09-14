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

        eventList.add(new EventFeedItem("1","کافه زاگرش","استقلال - پرسپولیس","تهران"));
        eventList.add(new EventFeedItem("2","کافه هرمس","ذوب آهن - سپاهان","اصفهان"));
        eventList.add(new EventFeedItem("3","کافه بالسا","تراکتور سازی - سیاه جامگان","تبریز"));
        eventList.add(new EventFeedItem("4","کافه لژان","مس کرمان- استقلال خوزستان","کرمان"));
        eventList.add(new EventFeedItem("5","کافه سفید","تربیت یزد - صنعت نفت","یزد"));
        eventList.add(new EventFeedItem("6","کافه زاگرش","استقلال - پرسپولیس","تهران"));
        eventList.add(new EventFeedItem("7","کافه هرمس","ذوب آهن - سپاهان","اصفهان"));
        eventList.add(new EventFeedItem("8","کافه بالسا","تراکتور سازی - سیاه جامگان","تبریز"));
        eventList.add(new EventFeedItem("9","کافه لژان","مس کرمان- استقلال خوزستان","کرمان"));
        eventList.add(new EventFeedItem("10","کافه سفید","تربیت یزد - صنعت نفت","یزد"));
        eventList.add(eventFeedItem);
        mAdapter.notifyDataSetChanged();
    }
}
