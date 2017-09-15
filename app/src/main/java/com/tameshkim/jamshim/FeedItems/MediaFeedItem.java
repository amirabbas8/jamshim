package com.tameshkim.jamshim.FeedItems;

import android.support.annotation.DrawableRes;

/**
 * Created by amirh on 15/09/17.
 */

public class MediaFeedItem {

    private String title1, desc1;
    private String title2, desc2;
    private String title3, desc3;
    @DrawableRes private int drawable1 , drawable2 , drawable3;

    public MediaFeedItem() { }

    public MediaFeedItem(String title1,String desc1,int drawable1,
                        String title2,String desc2,int drawable2,
                    String title3,String desc3,int drawable3) {

        this.title1 = title1;
        this.title2 = title2;
        this.title3 = title3;

        this.desc1 = desc1;
        this.desc2 = desc2;
        this.desc3 = desc3;

        this.drawable1 = drawable1 ;
        this.drawable2 = drawable2 ;
        this.drawable3 = drawable3 ;
    }

    public String getTitle1() {
        return title1;
    }
    public String getTitle2() {
        return title2;
    }
    public String getTitle3() {
        return title3;
    }

    public void setTitle1(String t) {
        this.title1 = t;
    }
    public void setTitle2(String t) {
        this.title2 = t;
    }
    public void setTitle3(String t) {
        this.title3 = t;
    }

    public String getDesc1(){ return desc1;}
    public String getDesc2(){ return desc2;}
    public String getDesc3(){ return desc3;}

    public void setDesc1(String desc) { desc1 = desc;}
    public void setDesc2(String desc) { desc2 = desc;}
    public void setDesc3(String desc) { desc3 = desc;}

    public int getDrawable1(){ return drawable1;}
    public int getDrawable2(){ return drawable2;}
    public int getDrawable3(){ return drawable3;}

    public void setDrawable1(int drawable) { drawable1 = drawable ;}
    public void setDrawable2(int drawable) { drawable2 = drawable ;}
    public void setDrawable3(int drawable) { drawable3 = drawable ;}
}


