package com.tameshkim.jamshim.FeedListAdapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tameshkim.jamshim.BuyActivity;
import com.tameshkim.jamshim.FeedItems.EventFeedItem;
import com.tameshkim.jamshim.R;

import java.util.List;


public class EventAdapter extends RecyclerView.Adapter<EventAdapter.MyViewHolder> {

    private List<EventFeedItem> eventList;
    private Activity activity;

    protected class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView name, teams, date;
        private CardView cardView;

        private MyViewHolder(View view) {
            super(view);
            cardView = (CardView) view.findViewById(R.id.card_view);
            name = (TextView) view.findViewById(R.id.name);
            teams = (TextView) view.findViewById(R.id.teams);
            date = (TextView) view.findViewById(R.id.date);


        }
    }


    public EventAdapter(Activity activity, List<EventFeedItem> eventList) {
        this.activity = activity;
        this.eventList = eventList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.feed_item_event, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final EventFeedItem item = eventList.get(position);
        holder.name.setText(item.getName());
        holder.date.setText(item.getDate());
        holder.teams.setText(item.getTeams());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, BuyActivity.class);

                intent.putExtra("id",item.getId());
                intent.putExtra("name",item.getName());
                intent.putExtra("date",item.getDate());
                intent.putExtra("teams",item.getTeams());
                activity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }


}
