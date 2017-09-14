package com.tameshkim.jamshim.FeedListAdapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tameshkim.jamshim.FeedItems.HomeFeedItem;
import com.tameshkim.jamshim.R;

import java.util.List;


public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

    private List<HomeFeedItem> homeList;
    private Activity activity;

    protected class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView txtName;

        private MyViewHolder(View view) {
            super(view);
//            txtName = (TextView) view.findViewById(R.id.txt_name);


        }
    }


    public HomeAdapter(Activity activity, List<HomeFeedItem> homeList) {
        this.activity = activity;
        this.homeList = homeList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.feed_item_home, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {}
    @Override
    public int getItemCount() {
        return homeList.size();
    }




}
