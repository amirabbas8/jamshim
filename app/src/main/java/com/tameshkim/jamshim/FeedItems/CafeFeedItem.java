package com.tameshkim.jamshim.FeedItems;

import android.support.annotation.DrawableRes;

public class CafeFeedItem {

    private String id, name, address;

    @DrawableRes private int drawable;

    public CafeFeedItem() {
    }
    public CafeFeedItem(String id,String name,String address , @DrawableRes int drawable) {
        this.id=id;
        this.name=name;
        this.address=address;
        this.drawable = drawable;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public @DrawableRes int getDrawable(){
        return drawable;
    }

    public void setDrawable(int drawable){ this.drawable = drawable;}
}