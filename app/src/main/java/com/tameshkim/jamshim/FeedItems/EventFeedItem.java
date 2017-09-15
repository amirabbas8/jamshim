package com.tameshkim.jamshim.FeedItems;

public class EventFeedItem {

    private String id, name, teams,date;

    public EventFeedItem() {
    }
    public EventFeedItem(String id,String name,String teams,String date) {
        this.id=id;
        this.name=name;
        this.teams=teams;
        this.date=date;
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


    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams = teams;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}