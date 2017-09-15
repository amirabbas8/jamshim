package com.tameshkim.jamshim.FeedListAdapters;

import android.app.Activity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tameshkim.jamshim.FeedItems.MediaFeedItem;
import com.tameshkim.jamshim.R;

import java.util.List;

/**
 * Created by amirh on 15/09/17.
 */

public class MediaAdapter extends RecyclerView.Adapter<MediaAdapter.MyViewHolder> {

    private List<MediaFeedItem> eventList;
    private Activity activity;

    protected class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView title1, title2 , title3;
        private TextView desc1, desc2 , desc3;
        private CardView cardView1 , cardView2 , cardView3;

        private MyViewHolder(View view) {
            super(view);
            cardView1 = (CardView) view.findViewById(R.id.card_view_media_1);
            cardView2= (CardView) view.findViewById(R.id.card_view_media_2);
            cardView3 = (CardView) view.findViewById(R.id.card_view_media_3);
            title1 = (TextView) view.findViewById(R.id.title_cardview1);
            title2 = (TextView) view.findViewById(R.id.title_cardview2);
            title3 = (TextView) view.findViewById(R.id.title_cardview3);
            desc1 = (TextView) view.findViewById(R.id.desc_cardview1);
            desc2 = (TextView) view.findViewById(R.id.desc_cardview2);
            desc3 = (TextView) view.findViewById(R.id.desc_cardview3);

        }
    }


    public MediaAdapter(Activity activity, List<MediaFeedItem> eventList) {
        this.activity = activity;
        this.eventList = eventList;
    }

    @Override
    public MediaAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.feed_item_media, parent, false);
        return new MediaAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MediaAdapter.MyViewHolder holder, int position) {
        final MediaFeedItem item = eventList.get(position);

        holder.title1.setText(item.getTitle1());
        holder.title2.setText(item.getTitle2());
        holder.title3.setText(item.getTitle3());

        holder.desc1.setText(item.getDesc1());
        holder.desc2.setText(item.getDesc2());
        holder.desc3.setText(item.getDesc3());

        holder.cardView1.setBackground(activity.getDrawable(item.getDrawable1()));
        holder.cardView2.setBackground(activity.getDrawable(item.getDrawable2()));
        holder.cardView3.setBackground(activity.getDrawable(item.getDrawable3()));

        holder.cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        holder.cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        holder.cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

}
