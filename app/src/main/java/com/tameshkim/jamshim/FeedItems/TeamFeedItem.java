package com.tameshkim.jamshim.FeedItems;

public class TeamFeedItem {

    private String id, teams;

    public TeamFeedItem() {
    }
    public TeamFeedItem(String id,String teams) {
        this.id=id;
        this.teams=teams;
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
}