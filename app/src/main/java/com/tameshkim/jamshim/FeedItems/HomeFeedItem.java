package com.tameshkim.jamshim.FeedItems;

public class HomeFeedItem {

    private String id, name, time, teams;
    private boolean prgLiking, myLike,prgDeleting;

    public HomeFeedItem() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getPrgLiking() {
        return prgLiking;
    }

    public void setPrgLiking(boolean prgLiking) {
        this.prgLiking = prgLiking;
    }

    public boolean isMyLike() {
        return myLike;
    }

    public void setMyLike(boolean myLike) {
        this.myLike = myLike;
    }

    public boolean isPrgDeleting() {
        return prgDeleting;
    }

    public void setPrgDeleting(boolean prgDeleting) {
        this.prgDeleting = prgDeleting;
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