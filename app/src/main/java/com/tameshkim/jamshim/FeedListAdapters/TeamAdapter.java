package com.tameshkim.jamshim.FeedListAdapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tameshkim.jamshim.EventActivity;
import com.tameshkim.jamshim.FeedItems.TeamFeedItem;
import com.tameshkim.jamshim.R;

import java.util.List;


public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.MyViewHolder> {

    private List<TeamFeedItem> teamList;
    private Activity activity;

    protected class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView teams;
        private CardView cardView;

        private MyViewHolder(View view) {
            super(view);
     teams = (TextView) view.findViewById(R.id.teams);
            cardView = (CardView) view.findViewById(R.id.card_view);

        }
    }


    public TeamAdapter(Activity activity, List<TeamFeedItem> teamList) {
        this.activity = activity;
        this.teamList = teamList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.feed_item_team, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        TeamFeedItem item=teamList.get(position);
        holder.teams.setText(item.getTeams());
        holder.cardView.setBackground(activity.getDrawable(item.getDrawable()));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.startActivity(new Intent(activity, EventActivity.class));
            }
        });
    }
    @Override
    public int getItemCount() {
        return teamList.size();
    }




}
