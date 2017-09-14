package com.tameshkim.jamshim.FeedItems;

public class HomeFeedItem {

    private String id, name, time, teams;
    private boolean prgLiking, myLike, prgDeleting;

    public HomeFeedItem() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams = teams;
    }
}