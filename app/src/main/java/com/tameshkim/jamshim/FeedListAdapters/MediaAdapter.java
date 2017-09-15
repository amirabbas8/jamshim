package com.tameshkim.jamshim.FeedListAdapters;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.tameshkim.jamshim.FeedItems.MediaFeedItem;
import com.tameshkim.jamshim.R;

import java.util.List;

/**
 * Created by amirh on 15/09/17.
 */

public class MediaAdapter extends RecyclerView.Adapter<MediaAdapter.MyViewHolder> {

    private List<MediaFeedItem> eventList;
    private Activity activity;

    private ImageView playImageView;
    private VideoView video;


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

            playImageView = (ImageView) view.findViewById(R.id.play_imageview);
            video = (VideoView) view.findViewById(R.id.video_view);
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

        playImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                playImageView.setVisibility(View.INVISIBLE);

                holder.title1.setVisibility(View.INVISIBLE);
                holder.desc1.setVisibility(View.INVISIBLE);

                MediaController mc= new MediaController(activity);
                video.setVisibility(View.VISIBLE);
                String path = "android.resource://" + activity.getPackageName() +  "/" + R.raw.video2 ;
                video.setVideoURI(Uri.parse(path));
                video.setMediaController(mc);
                video.setOnCompletionListener( new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {

                        mediaPlayer.start();
                        playImageView.setVisibility(View.VISIBLE);
                        holder.title1.setVisibility(View.VISIBLE);
                        holder.desc1.setVisibility(View.VISIBLE);
                        video.setVisibility(View.INVISIBLE);
                    }
                });
                video.start();

            }
        });
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

}
