package com.tameshkim.jamshim.FeedListAdapters;

import android.app.Activity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.tameshkim.jamshim.FeedItems.CafeFeedItem;
import com.tameshkim.jamshim.R;

import java.util.List;


public class CafeAdapter extends RecyclerView.Adapter<CafeAdapter.MyViewHolder> {

    private List<CafeFeedItem> homeList;
    private Activity activity;

    protected class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView name,address;
        private CardView cardView;
        private MyViewHolder(View view) {
            super(view);
            cardView = (CardView) view.findViewById(R.id.card_view);
           name = (TextView) view.findViewById(R.id.name);
            address = (TextView) view.findViewById(R.id.address);


        }
    }


    public CafeAdapter(Activity activity, List<CafeFeedItem> homeList) {
        this.activity = activity;
        this.homeList = homeList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.feed_item_cafe, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        CafeFeedItem item=homeList.get(position);
        holder.name.setText(item.getName());
        holder.address.setText(item.getAddress());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,"click shodam raft",Toast.LENGTH_SHORT).show();
            }
        });

    }
    @Override
    public int getItemCount() {
        return homeList.size();
    }




}
