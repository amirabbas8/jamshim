package com.tameshkim.jamshim.FeedItems;

import android.support.annotation.DrawableRes;

public class TeamFeedItem {

    private String id, teams;
    @DrawableRes private int drawable;

    public TeamFeedItem(String id,String teams, @DrawableRes int d) {
        this.id=id;
        this.teams=teams;
        this.drawable = d;

    }

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams = teams;
    }

    public @DrawableRes int getDrawable(){
        return drawable;
    }
}