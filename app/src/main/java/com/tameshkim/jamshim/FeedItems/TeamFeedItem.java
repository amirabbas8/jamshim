package com.tameshkim.jamshim.FeedItems;

public class TeamFeedItem {

    private String id, name, userId, profilePic, image,video, timeStamp, text, nLike,location, videoThumb;
    private boolean prgLiking, myLike,prgDeleting;

    public TeamFeedItem() {
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getUserId() {
        return userId;
    }


    public void setUserId(String userid) {
        this.userId = userid;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getProfilePic() {
        return profilePic;
    }


    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }


    public String getimage() {
        return image;
    }


    public void setimage(String image) {
        this.image = image;
    }

    public String getTimeStamp() {
        return timeStamp;
    }


    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public boolean getPrgLiking() {
        return prgLiking;
    }


    public void setPrgLiking(boolean prgLiking) {
        this.prgLiking = prgLiking;
    }



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNLike() {
        return nLike;
    }

    public void setNLike(String nLike) {
        this.nLike = nLike;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getVideoThumb() {
        return videoThumb;
    }

    public void setVideoThumb(String videoThumb) {
        this.videoThumb = videoThumb;
    }
}
