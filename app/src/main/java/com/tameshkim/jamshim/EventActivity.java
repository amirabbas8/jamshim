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
import java.util.Objects;

public class EventActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private EventAdapter mAdapter;
    private List<EventFeedItem> eventList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        String name=getIntent().getExtras().getString("name");
        String teams=getIntent().getExtras().getString("teams");
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new EventAdapter(this, eventList);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        eventList.add(new EventFeedItem("1","کافه زاگرس","استقلال - پرسپولیس","امروز"));
        eventList.add(new EventFeedItem("2","کافه هرمس","ذوب آهن - سپاهان","فردا"));
        eventList.add(new EventFeedItem("3","کافه بالسا","تراکتور سازی - سیاه جامگان","26 شهریور"));
        eventList.add(new EventFeedItem("4","کافه لژان","مس کرمان- استقلال خوزستان","25 شهریور"));
        eventList.add(new EventFeedItem("5","کافه سفید","تربیت یزد - صنعت نفت","27 شهریور"));
        eventList.add(new EventFeedItem("6","کافه زاگرس","بورنموث - برایتون","فردا"));
        eventList.add(new EventFeedItem("7","کافه هرمس","لیورپول - برنلی","26 شهریور"));
        eventList.add(new EventFeedItem("8","کافه بالسا","هانوفر - هامبورگ","امروز"));
        eventList.add(new EventFeedItem("9","کافه لژان","رءال سوسیاد - رءال مادرید","25 شهریور"));
        eventList.add(new EventFeedItem("10","کافه سفید","خیرونیا - سویا","27 شهریور"));
        if((name!=null&& !Objects.equals(name, ""))){


    for (int i = 0; i < eventList.size(); i++) {
        if(!Objects.equals(eventList.get(i).getName(), name)){
            eventList.remove(i);
            i--;
        }
    }
}else{


            for (int i = 0; i < eventList.size(); i++) {
                if(!Objects.equals(eventList.get(i).getTeams(), teams)){
                    eventList.remove(i);
                    i--;
                }
            }
        }


        mAdapter.notifyDataSetChanged();
    }
}
